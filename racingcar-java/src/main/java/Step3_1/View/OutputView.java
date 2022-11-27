package Step3_1.View;

public class OutputView {
    public OutputView() {

    }

    public void showResult(){
        System.out.println("실행 결과");
    }

    public void showPosition(int position){
        for(int i = 0; i < position; i++){
            System.out.print("-");
        }
        System.out.println();
    }
}
