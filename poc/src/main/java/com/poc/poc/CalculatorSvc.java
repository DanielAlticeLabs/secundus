package com.poc.poc;
 
import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class CalculatorSvc {
    @GetMapping("/hello")
    public HashMap<String, String> sayHello() {
        var map = new HashMap<String, String>();
 
        map.put("greeting", "Hello");
        map.put("planet", "World");
 
        return map;
    }

    @GetMapping("/op/{a}/{b}")
    int op(@PathVariable int a, @PathVariable int b) {
        return Calculator.operation(a, b);
    }
}