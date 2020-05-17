package com.balceda.demo.beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloAction {

    private final Logger log = LogManager.getLogger(HelloAction.class);

    private String greeting;

    public String execute(){
        log.info("execute::");

        this.greeting = "Hello Struts2!";

        return "success";
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
