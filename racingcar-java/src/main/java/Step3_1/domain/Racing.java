package Step3_1.domain;

import Step3_1.View.OutputView;

import java.util.ArrayList;

public class Racing {

    public OutputView outputView = new OutputView();
    private ArrayList<RacingCar> racingCars = new ArrayList<>();

    public void carReady(int carCount){
        for(int i = 0; i < carCount; i++){
            racingCars.add(new RacingCar(i));    // ArrayList에 값을 넣어줄 때에는 add()메서드 사용
        }
    }

    public void carMove(int carCount, int raceCount, String[] names){
        for(int i = 0; i < raceCount; i++){
            for(int j = 0; j < carCount; j++){
                racingCars.get(j).move();
                outputView.showPlayer(names[j]);
                outputView.showPosition(racingCars.get(j).getPosition());
            }
            System.out.println();
        }
    }

    public void raceWinner(int carCount, String[] names){
        ArrayList<Integer> winner = new ArrayList<Integer>();
        winner.add(0);    // 초기화
        int max = racingCars.get(winner.get(winner.size() - 1)).getPosition();

        for(int i = 1; i < carCount; i++){
            if(max == racingCars.get(i).getPosition()){
                winner.add(i);
            } else if(max < racingCars.get(i).getPosition()) {
                System.out.println(max + " < " + racingCars.get(i).getPosition());
                winner.clear();
                winner.add(i);
            }
        }

        String[] winnerNames = new String[winner.size()];
        for(int i = 0; i < winner.size(); i++){
            winnerNames[i] = names[winner.get(i)];
        }
        
        outputView.showWinner(winnerNames);
    }
}
