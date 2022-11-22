package Step2_1.Domain;

import java.util.Arrays;
import java.util.stream.Stream;

public class Operator {
    private String operator;

    public String findOperator(String[] expression, int i){
        if(i == 0){
            operator = expression[1];
        } else {
            operator = expression[i + 1];
        }

        return operator;
    }
}
