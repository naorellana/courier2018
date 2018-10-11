
package com.norellanac.courier2018.controllers;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
    //@Autowired
    @GetMapping("/")
    public String newUsuario(HttpServletRequest req) {
        req.setAttribute("action", "saveUsuario");
        return "login";
    }
  
    @GetMapping("/fonts/roboto/Roboto-Light.woff")
	public void Light(HttpServletResponse resp, HttpServletRequest req) throws IOException {
                resp.sendRedirect("/");
	}
        
    @GetMapping("/fonts/roboto/Roboto-Bold.woff")
    public void Bold(HttpServletResponse resp, HttpServletRequest req) throws IOException {
        resp.sendRedirect("/");
    }
    
    @GetMapping("/fonts/roboto/Roboto-Regular.woff")
    public void Regular(HttpServletResponse resp, HttpServletRequest req) throws IOException {
        resp.sendRedirect("/");
    }
    
    @GetMapping("/fonts/roboto/Roboto-Medium.woff")
    public void Medium(HttpServletResponse resp, HttpServletRequest req) throws IOException {
        resp.sendRedirect("/");
    }
        
   
}