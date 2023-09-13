package pro.sky.skyprocalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/calculator")
public class CalculatorConrtoller {
    @Autowired
   public CalculatorServiceImpl service;
    @GetMapping
    public String hello(){
        return service.hello();
    }
    @GetMapping(path = "/plus")
    public String sum(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b){
        return a + " + " + b + " = "+  service.sum(a,b);
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b){
        return a + " - " + b + " = "+   service.minus(a,b);
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b){
        return a + " * " + b + " = "+  service.multiply(a,b);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b){
        return a + " / " + b + " = "+ service.divide(a,b);
    }
}
