package Step3_1.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    private int carCount;

    private int raceCount;

    public InputView() {

    }
    public void input() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("자동차 대수는 몇 대 인가요?");
        carCount = Integer.parseInt(bufferedReader.readLine());
        System.out.println("시도할 횟수는 몇 회 인가요?");
        raceCount = Integer.parseInt(bufferedReader.readLine());
    }

    public int getCarCount() {
        return carCount;
    }

    public int getRaceCount() {
        return raceCount;
    }
}
