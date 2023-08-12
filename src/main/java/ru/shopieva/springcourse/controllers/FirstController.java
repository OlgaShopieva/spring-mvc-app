package ru.shopieva.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model){
        //System.out.println("Hello " + name + " " + surname);
        model.addAttribute("message", "Hello " + name + " " + surname);
        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String goodByePage(){
        return "first/goodbye";
    }
    @GetMapping("/calculator")
    public String calculateNum(@RequestParam(value = "num1", required = false) int num1,
                               @RequestParam(value = "num2", required = false) int num2,
                               @RequestParam(value = "operation", required = false) String operation,
                               Model model){
        double result = 0;
        switch (operation) {
            case "multiplication":
                result = num1 * num2;
                break;
            case "division":
                result = num1 / (double)num2;
                break;
            case "subtraction":
                result = num1 - num2;
                break;
            case "addition": result = num1 + num2;
            break;
        }
        model.addAttribute("answer", result);
        return "first/calculator";
    }
}
