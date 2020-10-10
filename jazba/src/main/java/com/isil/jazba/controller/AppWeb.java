package com.isil.jazba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.isil.jazba.model.User;
import com.isil.jazba.service.SecurityService;
import com.isil.jazba.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AppWeb {

	@Autowired
    private UserService userService;
	@Autowired
    private SecurityService securityService;


    @GetMapping(value = {"/login"})
    private String index(){
        return "login";
    }

    @GetMapping("/menu")
    private String menu(){
        return "menu";
    }

    @GetMapping("/logout")
    private String logout(HttpServletRequest request, HttpServletResponse response){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if(auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login";
    }

    // desde el link de Login
    @GetMapping("/registration")
    private String registration(Model model){
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/registration")
    private String registration(User user){
        userService.save(user);
        //autologin
        securityService.autoLogin(user.getUsername(), user.getPasswordConfirm());

        return "redirect:/menu";
    }

}
