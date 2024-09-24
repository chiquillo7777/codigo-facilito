package org.benek.bootcamp.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller//stereotype == component-scanned
public class Login {
    @PostMapping("/iniciarSesion")
    public String login(@RequestParam String usuario, @RequestParam String password, Model model) {
        if(!usuario.isBlank() || !password.isBlank()) {
            model.addAttribute("usuario", usuario);
            model.addAttribute("password", password);
        }else{
            model.addAttribute("mensajeError", "Debes ingresar usuario y contraseña");
            return "error";
        }
        return "dashboard";
    }

}
