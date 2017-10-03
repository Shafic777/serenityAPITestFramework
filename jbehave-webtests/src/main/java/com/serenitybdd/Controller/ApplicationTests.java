package com.serenitybdd.Controller;


import com.serenitybdd.core.*;
import com.serenitybdd.core.ScenarioConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.autoconfigure.*;
import org.springframework.*;


@SpringBootApplication
@Support({ScenarioConfig.class})
public class ApplicationTests {

    public static void main(String [] args)
    {
        SpringApplicationBuilder builder=new SpringApplicationBuilder(ApplicationTests.class);
        builder.headless(false).web(false).run(args);
    }
}
