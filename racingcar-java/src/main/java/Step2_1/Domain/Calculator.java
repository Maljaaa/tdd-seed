package Step2_1.Domain;

public class Calculator {
    private int result;


    public int calculate(String[] expression){
        String[] opr = new String[expression.length / 2];
        int[] num = new int[expression.length / 2 + 1];
        result = Integer.parseInt(expression[0]);
        Operator operator = new Operator();
        Number number = new Number();

        // operator 찾아서 넣어주기
        // number 찾아서 넣어주기
        for(int i = 0; i < expression.length / 2; i++){
            opr[i] = operator.findOperator(expression, i * 2);
//            System.out.println("opr[" + i + "]" + opr[i]);
        }

        for(int i = 0; i < expression.length / 2 + 1; i++){
            num[i] = number.findNumber(expression, i);
//            System.out.println("num[" + i + "]" +num[i]);
        }

        for(int i = 0; i < expression.length / 2; i++) {
            if(opr[i].equals("+")){
//                System.out.print(result + opr[i] + num[i + 1] + "=");
                result += num[i + 1];
//                System.out.println(result);
            } else if (opr[i].equals("-")) {
//                System.out.print(result + opr[i] + num[i + 1] + "=");
                result -= num[i + 1];
//                System.out.println(result);
            } else if (opr[i].equals("*")) {
//                System.out.print(result + opr[i] + num[i + 1] + "=");
                result *= num[i + 1];
//                System.out.println(result);
            } else if (opr[i].equals("/")) {
//                System.out.print(result + opr[i] + num[i + 1] + "=");
                result /= num[i + 1];
//                System.out.println(result);
            }
        }


        return result;
    }
}
