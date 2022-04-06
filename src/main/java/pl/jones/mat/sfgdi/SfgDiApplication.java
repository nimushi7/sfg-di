package pl.jones.mat.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.jones.mat.sfgdi.controllers.ConstructorInjectedController;
import pl.jones.mat.sfgdi.controllers.MyController;
import pl.jones.mat.sfgdi.controllers.PropertyInjectedController;
import pl.jones.mat.sfgdi.controllers.SetterBasedController;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println(myController.sayHello());


        System.out.println("-------- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------ SETTER");
        SetterBasedController setterBasedController = (SetterBasedController) ctx.getBean("setterBasedController");
        System.out.println(setterBasedController.getGreeting());

        System.out.println("------ Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
