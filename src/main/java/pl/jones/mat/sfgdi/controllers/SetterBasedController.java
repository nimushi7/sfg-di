package pl.jones.mat.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import pl.jones.mat.sfgdi.services.GreetingService;

@Controller
public class SetterBasedController {

    private GreetingService greetingService;

    @Qualifier("setterBasedGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
