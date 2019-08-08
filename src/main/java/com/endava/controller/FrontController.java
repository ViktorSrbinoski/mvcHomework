package com.endava.controller;

import com.endava.model.Citizen;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
@RequestMapping(value = "/")
public class FrontController {

    @ModelAttribute
    public void showMessage(Model model) {
        model.addAttribute("welcomeMSG", "Hello fellow human");
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView frontPage(){
        return new ModelAndView("index");
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ModelAndView processForm(@ModelAttribute("index") @Valid Citizen citizen, BindingResult result){
        if(result.hasErrors()){
            return new ModelAndView("index");
        }
        ModelAndView modelAndView = new ModelAndView("details");
        modelAndView.addObject("citizen", citizen);
        return modelAndView;
    }
}
