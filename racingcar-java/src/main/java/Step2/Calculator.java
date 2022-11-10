package Step2;

import java.util.regex.Pattern;

public class Calculator {
    private int result; // 결과값
    private Operator currentOperator;
    private static final String regExp = "^[0-9]*$";    // 숫자만(정규표현식)

    public int calculateFormula(String[] formulaArray){
        result = 0; // 0으로 초기화
        currentOperator = Operator.PLUS;    // 현재 연산자를 plus로 초기화

        for(String input : formulaArray){   // 한 글자씩 input에 대응
            calculatePartial(input);
        }

        return result;
    }

    private void calculatePartial(String input){
        // Pattern 클래스를 활용하여 정규 표현식에 대상 문자열을 검정
        if(Pattern.matches(regExp, input)){ // 숫자만 골라서
            result = currentOperator.operate(result, Integer.parseInt(input));  // result 값과 input값을 현재 operate로 계산
            return;
        }
        currentOperator = Operator.findOperator(input); // 현재 연산자 구하기
    }


}
