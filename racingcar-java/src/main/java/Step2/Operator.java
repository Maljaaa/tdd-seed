package Step2;

import java.util.Collections;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 연산자 열거
enum Operator {
    // 람다식 표현 사용
    PLUS("+", (first, second) -> first + second),   // 더하기
    MINUS("-", (first, second) -> first - second),  // 빼기
    MULTIPLY("*", (first, second) -> first * second),   // 곱하기
    DVIDE("/", (first, second) -> { // 나누기
       if(second == 0) throw new IllegalArgumentException();    // 나눠지는 수 예외 던지기
       return first / second;
    });

    private String symbol;
    // 함수형 인터페이스
    private BiFunction<Integer, Integer, Integer> operation;    // 매개변수 o, 반환값 o

    Operator(String symbol, BiFunction<Integer, Integer, Integer> operation){
        this.symbol = symbol;
        this.operation = operation;
    }

    public String getSymbol(){
        return symbol;
    }

    public int operate(int first, int second){
        return operation.apply(first, second);  // first, second 활용하기
    }

    // map에 저장
    private static final Map<String, Operator> operatorMap = Collections.unmodifiableMap(Stream.of(values()).collect(Collectors.toMap(operator -> operator.getSymbol(), operator -> operator)));

    // 연산자 찾기
    public static Operator findOperator(String symbol){
        Operator operator = operatorMap.get(symbol);    // 연산자 찾기

        if(operator == null) throw new IllegalArgumentException();  // null 예외 날리기
        return operator;
    }
}
