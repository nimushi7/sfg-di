package pl.jones.mat.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterBasedGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
