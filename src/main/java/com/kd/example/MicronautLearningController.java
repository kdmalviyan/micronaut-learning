package com.kd.example;

import io.micronaut.http.annotation.*;

@Controller("/micronautLearning")
public class MicronautLearningController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}