package com.trinity.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class HC {

    @GetMapping("/{a}/{b}")
    public String calc(@PathVariable int a, @PathVariable int b) {
        int add = a + b;
        int sub = a - b;
        int pro = a * b;
        int div = a / b;
        int rem = a % b;
        return "ADD = " + add +"<br>" + " Sub = " + sub +"<br>" + " Product = " + pro +"<br>" + " Quotent = " + div +"<br>" + " rem = " + rem;
    }

    @GetMapping("/add/{a}/{b}")
    public int add(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    @GetMapping("/sub/{a}/{b}")
    public int sub(@PathVariable int a, @PathVariable int b) {
        return a - b;
    }

    @GetMapping("/pro/{a}/{b}")
    public int pro(@PathVariable int a, @PathVariable int b) {
        return a * b;
    }

    @GetMapping("/quo/{a}/{b}")
    public int quo(@PathVariable int a, @PathVariable int b) {
        return a / b;
    }

    @GetMapping("/rem/{a}/{b}")
    public int rem(@PathVariable int a, @PathVariable int b) {
        return a % b;
    }

}














//    @GetMapping("/")
//    @ResponseBody
//    public String hello(){
//        return "<!DOCTYPE html>" +
//                "<html lang=\"en\">" +
//                "<head>" +
//                "    <meta charset=\"UTF-8\">" +
//                "    <title>hi</title>" +
//                "</head>" +
//                "<body>" +
//                "    <h1>Hi</h1>" +
//                "</body>" +
//                "</html>";
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

//    @GetMapping({"/hello/{name}", "/hello/{name}/{city}", "/hello/{name}/{city}/{college}","/hello/{name}/{city}/{college}/{age}"})
//    public String sayHello(@PathVariable String name, @PathVariable(required = false) String city, @PathVariable(required = false) String college, @PathVariable(required = false) int age
//    ) {
//        if (age != 0) {
//            return "Hi I am " + name + ", from " + city + ", I am "+age+" years old . Welcome to " + college + "!";
//        }
//        if (college != null) {
//            return "Hi I am " + name + ", from " + city + ", welcome to " + college + "!";
//        }
//
//        if (city != null) {
//            return "Hi I am " + name + ", from " + city + "!";
//        }
//
//        return "Hi I am " + name + "!";
//    }




