package com.bandaimall.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
public class HomeController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index(Locale locale, Model model){
        return "index";
    }
}
