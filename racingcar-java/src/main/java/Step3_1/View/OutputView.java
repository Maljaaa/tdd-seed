package Step3_1.View;

import java.util.Arrays;

public class OutputView {

    public void showResult(){
        System.out.println("실행 결과");
    }

    public void showPosition(int position){
        for(int i = 0; i < position; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    public void showPlayer(String name){
        System.out.print(name + " : ");
    }

    public void showWinner(String[] names){
        for(int i = 0; i < names.length; ++i){
            System.out.print(" " + names[i]);
        }
        System.out.println("가 최종 우승했습니다!");
    }
}
