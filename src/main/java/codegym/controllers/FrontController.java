package codegym.controllers;

import codegym.model.MoneyConvert;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController {
    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("memory",new MoneyConvert());
        return "index";
    }
    @PostMapping("/result")
    public String result(@ModelAttribute MoneyConvert moneyConvert, Model model) {
        Double result = moneyConvert.getRate()*moneyConvert.getUsd();
        model.addAttribute("ketqua", result);
        System.out.println(result);
        return "index";
    }
}
