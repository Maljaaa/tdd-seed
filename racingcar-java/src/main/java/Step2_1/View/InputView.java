package Step2_1.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private String expression = bufferedReader.readLine();

    public InputView() throws IOException {
        this.expression = expression;
    }

    public String[] splitExpression(){
        return expression.split(" ");
    }

}
