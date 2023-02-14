package br.com.erudio.Math;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleMath {

    public Double sum (Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    public Double subtraction(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    public Double multiplication(Double numberOne, Double numberTwo){
        return numberOne * numberTwo;
    }

    public Double division(Double numberOne, Double numberTwo) {

        return numberOne / numberTwo;
    }

    public Double mean(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo / 2;
    }

    public Double squareRoot(Double number) throws Exception{
        return Math.sqrt(number);
    }
}
