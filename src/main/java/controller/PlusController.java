package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlusController {
    @GetMapping(path = "plusform")
    public String plusform(){
        return "PlusFrom";
    }
}