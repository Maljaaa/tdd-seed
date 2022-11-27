package Step3_1.domain;

import java.util.Random;

public class RacingCar {
    private int position;
    private Random random = new Random();

    public RacingCar(){
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void move(){
        if(4 > random.nextInt(10)){
            position++;
        }
    }
}
