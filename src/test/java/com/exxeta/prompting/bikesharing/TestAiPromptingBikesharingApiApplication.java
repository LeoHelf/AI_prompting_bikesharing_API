package com.exxeta.prompting.bikesharing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestAiPromptingBikesharingApiApplication {

    public static void main(String[] args) {
        SpringApplication.from(AiPromptingBikesharingApiApplication::main).with(
                TestAiPromptingBikesharingApiApplication.class).run(args);
    }

}
