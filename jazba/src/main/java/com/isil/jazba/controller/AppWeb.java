package com.isil.jazba.controller;

import com.isil.jazba.repository.IUserJPA;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.isil.jazba.model.User;
import com.isil.jazba.service.SecurityService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AppWeb {

    private final IUserJPA userService;
    private final SecurityService securityService;

    public AppWeb(IUserJPA userService, SecurityService securityService) {
        this.userService = userService;
        this.securityService = securityService;
    }


    @GetMapping(value = {"/login"})
    private String login(){
        return "login";
    }
    @PostMapping("/login")
    private String inicio(User user){
        //autologin
        securityService.autoLogin(user.getUsername(), user.getPassword());

        return "redirect:/perfil";
    }

    @GetMapping("/perfil")
    private String perfil(){
        return "perfil";
    }

    @GetMapping("/menu")
    private String menu(){
        return "menu";
    }

    @GetMapping("/index")
    private String index(){
        return "index";
    }

    @GetMapping("/logout")
    private String logout(HttpServletRequest request, HttpServletResponse response){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if(auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login";
    }

//     desde el link de registro
//    @GetMapping("/registration")
//    private String registration(Model model){
//        model.addAttribute("user", new User());
//        return "registration";
//    }
//
//    @PostMapping("/registration")
//    private String registration(User user){
//        userService.save(user);
//        //autologin
//        securityService.autoLogin(user.getUsername(), user.getPasswordConfirm());
//
//        return "redirect:/perfil";
//    }

}
