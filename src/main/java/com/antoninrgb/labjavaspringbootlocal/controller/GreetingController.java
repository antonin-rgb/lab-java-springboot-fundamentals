/*
Create a GreetingController class that has the following endpoints:
/hello - Returns "Hello World!"
/hello/{name} - Returns "Hello {name}!" where {name} is a path variable
/add/{num1}/{num2} - Returns the sum of num1 and num2
/multiply/{num1}/{num2} - Returns the product of num1 and num2
*/

package com.antoninrgb.labjavaspringbootlocal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String sayHelloWorld() {
        return "Hello, World!";
    }

    @GetMapping("/hello/{name}")
    public String sayHelloToo(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/add/{num1}/{num2}")
    public int add(@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }

    @GetMapping("/multiply/{num1}/{num2}")
    public int multiply(@PathVariable int num1, @PathVariable int num2) {
        return num1 * num2;
    }
}

