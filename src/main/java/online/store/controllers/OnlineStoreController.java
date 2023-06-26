package online.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OnlineStoreController {

    @GetMapping("/")
    public String home(){
        return "home";
    }


}
