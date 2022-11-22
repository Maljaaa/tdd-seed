package Step2_1;

import Step2_1.Domain.Calculator;
import Step2_1.View.InputView;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] expression = new InputView().splitExpression();
//        for(String i : expression){
//            System.out.println(i);
//        }
        Calculator calculator = new Calculator();
        int result = calculator.calculate(expression);
        System.out.println("계산 결과 : " + result);
    }
}
