package Step3_1.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    private int carCount;
    private int raceCount;
    String[] names;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public void inputCarCount() throws IOException {
        System.out.println("자동차 대수는 몇 대 인가요?");
        carCount = Integer.parseInt(bufferedReader.readLine());
    }

    public void inputNames() throws IOException {
        System.out.println("각 자동차의 이름을 한 줄로 (,)로 나누어 적어주세요.");
        names = bufferedReader.readLine().split(",");
    }

    public void inputRaceCount() throws IOException {
        System.out.println("시도할 횟수는 몇 회 인가요?");
        raceCount = Integer.parseInt(bufferedReader.readLine());
    }

    public int getCarCount() {
        return carCount;
    }

    public int getRaceCount() {
        return raceCount;
    }

    public String[] getNames() {
        return names;
    }

//    public String getName(int index){
//        return names[index];
//    }
}
