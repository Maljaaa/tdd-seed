package Step2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String[] formula = new Formula("2 + 3 * 4 / 2").splitFormula();
        int result = calculator.calculateFormula(formula);
        System.out.println("result : " + result);
    }
}
