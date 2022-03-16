package com.gokhan.sfgdi.Controllers;

import com.gokhan.sfgdi.services.GreetingService;

public class ConstructorInjectedController {
    public final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
