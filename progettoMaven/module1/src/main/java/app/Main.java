package app;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import app.Utility.MetodiP;

import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        MetodiP i = new MetodiP();
        i.altriMetodi();
        //System.out.println("Hello world!");

    }
}