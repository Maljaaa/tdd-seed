package Step3_1.domain;

import Step3_1.View.OutputView;

import java.util.ArrayList;

public class Racing {
    private ArrayList<RacingCar> racingCars = new ArrayList<>();
    public OutputView outputView = new OutputView();

    public Racing(){

    }

    public void carReady(int carCount){
        for(int i = 0; i < carCount; i++){
            racingCars.add(new RacingCar());    // ArrayList에 값을 넣어줄 때에는 add()메서드 사용
        }
//        System.out.println("carReady");
        //        racingCars.forEach(i r-> racingCars.set(i, new RacingCar(0))); -> map으로 바꿔라
    }

    public void carMove(int carCount, int raceCount){
//        System.out.println("carMove");
        for(int i = 0; i < raceCount; i++){
            for(int j = 0; j < carCount; j++){
                racingCars.get(j).move();
                outputView.showPosition(racingCars.get(j).getPosition());
            }
        }
    }
}
