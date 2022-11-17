package Step2;

public class Formula {
    private String formula;

    public Formula(String formula) {
        this.formula = formula;
    }

    // 빈 칸 나누기
    String[] splitFormula(){
        return formula.split(" ");
    }
}
