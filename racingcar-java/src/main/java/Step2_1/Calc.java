package Step2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        String[] strArray = str.split(" ");

        for(int i=0;i<strArray.length;i++) {
            System.out.println(strArray[i]);
        }

        int result = Integer.parseInt(strArray[0]);

        for(int j = 1; j < strArray.length; j+=2){
            int first = result;
            String operate = strArray[j];
            int second = Integer.parseInt(strArray[j + 1]);

            if(operate.equals("+")){
                result = first + second;
            } else if (operate.equals("-")) {
                result = first - second;
            } else if (operate.equals("*")) {
                result = first * second;
            } else if (operate.equals("/")) {
                result = first / second;
            }
        }

        System.out.println("result : " + result);
    }
}
