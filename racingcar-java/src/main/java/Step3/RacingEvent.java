package Step3;

import java.util.ArrayList;
import java.util.Scanner;

public class RacingEvent {
    private int carCount;
    private int tryCount;
    private ArrayList<RacingCar> participatedCarList = new ArrayList<>();
    private ResultView view = new ResultView();

    RacingEvent(){
        setUpRacingEvent();
        readyForRacingEvent();
        startRacingEvnet();
    }

    private void setUpRacingEvent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        carCount = scanner.nextInt();
        System.out.println("시도할 횟수는 몇 회 인가요?");
        tryCount = scanner.nextInt();
        System.out.println("");
        System.out.println("실행 결과");
    }
    private void readyForRacingEvent(){
        for(int i = 0; i < carCount; i++){
            participatedCarList.add(new RacingCar());
        }

    }
    private  void startRacingEvnet(){
        for(int i = 0; i < tryCount; i++){
            for(RacingCar car : participatedCarList){
                car.tryMoveForward();
            }
        }
    }
    void showRacingGame(){
        for(int i = 1; i <= tryCount; i++){
            for(RacingCar car : participatedCarList){
                view.showCurrentPosition(i, car.getSuccessCount());
            }
            System.out.println("");
        }
    }
}
