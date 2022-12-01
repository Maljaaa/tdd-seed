package Step3_1.domain;

import Step3_1.View.InputView;

import java.util.Random;

public class RacingCar {
    InputView inputView = new InputView();
    private int position;
    private int index;
    private Random random = new Random();

    public RacingCar(int index){
        this.index = index;
    }

    public int getPosition() {
        return position;
    }

    public int getIndex() {
        return index;
    }

    public void move(){
        if(4 <= random.nextInt(10)){
            position++;
        }
    }
}
