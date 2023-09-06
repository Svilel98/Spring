package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Service
public class CalculatorServiceImpl {

    public String hello(){
        return "Добро пожаловать в калькулятор";
    }
    public String sum(Integer a, Integer b){
        if (a != null || b !=null){
        return a + " + " + b + " = "+ (a + b);
    } else {
            throw new IllegalArgumentException("Отстутвуют входные данные");
        }
    }
    public String minus(Integer a, Integer b){
        if (a != null || b !=null){
        return a + " - " + b + " = "+ (a - b);
    }
        else {
            throw new IllegalArgumentException("Отстутвуют входные данные");
        }
    }
    public String multiply(Integer a, Integer b) {
        if (a != null || b != null) {
            return a + " * " + b + " = " + (a * b);
        }
        else{
                throw new IllegalArgumentException("Отстутвуют входные данные");
            }
        }
        public String divide (Integer a, Integer b){
        if (b == 0){
            throw new IllegalArgumentException("Делитель не может быть равен нулю");
        }
            if (a != null || b != null) {
                return a + " / " + b + " = " + (a / b);
            }
            else{
                    throw new IllegalArgumentException("Отстутвуют входные данные");
                }
            }
        }
