package Step2_1.Domain;

public class Number {
    private int num;

    public int findNumber(String[] expression, int i){
        num = Integer.parseInt(expression[i * 2]);

        return num;
    }
}
