package com.trinity.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HC {
//    @GetMapping("")
//    public String hello(){
//        return "hi";
//    }
//
//    @GetMapping("/hello/{name}")
//    public String sayHello(@PathVariable String name){
//        return "Hello " + name + "!";
//    }
//
//
//    @GetMapping("/hello/{name}/{city}")
//    public String sayHello(@PathVariable String name ,@PathVariable String city ){
//        return "Hello i am " + name +" , from "+ city+" , welcome to !";
//    }
//
//    @GetMapping("/hello/{name}/{city}/{collage}")
//    public String sayHello(@PathVariable String name ,@PathVariable String city ,@PathVariable String collage){
//        return "Hello i am " + name +" , from "+ city+" , welcome to "+collage +" !";
//    }

    @GetMapping({"/hello/{name}", "/hello/{name}/{city}", "/hello/{name}/{city}/{college}"})
    public String sayHello(@PathVariable String name, @PathVariable(required = false) String city, @PathVariable(required = false) String college
    ) {
        if (college != null) {
            return "Hi I am " + name + ", from " + city + ", welcome to " + college + "!";
        }

        if (city != null) {
            return "Hi I am " + name + ", from " + city + "!";
        }

        return "Hi I am " + name + "!";
    }

    }



