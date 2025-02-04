package pl.jones.mat.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"PL", "default"})
@Service("i18nService")
public class I18nPolishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Siemano";
    }
}
