package com.site.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;



//usado para manipular as rotas
@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("message","RODOU PORRA!!!!!"); 
        return "home";
}
}