package Step2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        String[] strArray = str.split(" ");

        for(int i=0;i<strArray.length;i++) {
            System.out.println(strArray[i]);
        }

        int result = Integer.parseInt(strArray[0]);

        for(int i = 1; i < strArray.length; i++){
            if()
        }

    }
}
