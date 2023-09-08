package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Service
public class CalculatorServiceImpl {

    public String hello(){
        return "Добро пожаловать в калькулятор";
    }
    public int sum(Integer a, Integer b){
        if (a != null || b !=null){
        return a + b;
    } else {
            throw new IllegalArgumentException("Отстутвуют входные данные");
        }
    }
    public int minus(Integer a, Integer b){
        if (a != null || b !=null){
        return a - b;
    }
        else {
            throw new IllegalArgumentException("Отстутвуют входные данные");
        }
    }
    public int multiply(Integer a, Integer b) {
        if (a != null || b != null) {
            return a * b;
        }
        else{
                throw new IllegalArgumentException("Отстутвуют входные данные");
            }
        }
        public int divide (Integer a, Integer b){
        if (b == 0){
            throw new IllegalArgumentException("Делитель не может быть равен нулю");
        }
            if (a != null || b != null) {
                return a / b;
            }
            else{
                    throw new IllegalArgumentException("Отстутвуют входные данные ");
                }
            }
        }
