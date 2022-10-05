package br.com.kaiquekira.gerenciamentoclientes.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("boasVindas", "Bem vindo ao curso de Spring com Thymeleaf");

        List<String> aulas = new ArrayList<>();

        aulas.add("Aula 01 - Introdução");
        aulas.add("Aula 02 - Template engine");
        aulas.add("Aula 03 - Arquivos estatitos");

        model.addAttribute("aulas", aulas);

        return "home";
    }

    @GetMapping("/mensagem")
    public ModelAndView mensagem() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("mensagem");
        modelAndView.addObject("mensagem", "Mensagem Vinda do Servidor");

        return modelAndView;
    }

    @GetMapping("/saudacao/{nome}")
    public ModelAndView saudacao(@PathVariable String nome) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("saudacao");
        modelAndView.addObject("nome", nome);
        return modelAndView;
    }
}
