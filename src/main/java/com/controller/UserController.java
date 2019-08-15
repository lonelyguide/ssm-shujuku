package com.controller;

        import com.bean.userinfo;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        List<userinfo>userinfos=userService.findAll();
        ModelAndView mv =new ModelAndView();
        mv.addObject("ui",userinfos);
        mv.setViewName("allUser");
        return  mv;
    }
    @RequestMapping("/toAddUser.do")
    public String toaddUser(){
        return  "addUser";
    }

    @RequestMapping("/save.do")
    public String addUser(userinfo a)
    {
        userService.addUser(a);
        return "redirect:/user/findAll.do";
    }

    @RequestMapping("/delete.do")
    public String delete(long id)
    {
        userService.delete(id);
        return "redirect:/user/findAll.do";
    }

    @RequestMapping("/toUpdate.do")
    public ModelAndView toUpdate(int id)
    {
        userinfo user=userService.userB(id);
        ModelAndView a=new ModelAndView();
        a.addObject("userInfo",user);
        a.setViewName("updateUser");
        return  a;
    }
    @RequestMapping("/update.do")
    public String update(userinfo a)
    {
        userService.updateuser(a);
        return "redirect:/user/findAll.do";
    }

}
