package at.sds.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //GET
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }

    //GET
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World2!");
    }

    @GetMapping(path ="/hello-world-bean/{id}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String id) {
        return new HelloWorldBean(String.format("Hello %s", id));
    }
}
