package Step3_1;

import Step3_1.View.InputView;
import Step3_1.View.OutputView;
import Step3_1.domain.Racing;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        InputView inputView = new InputView();
        inputView.input();
        OutputView outputView = new OutputView();
        outputView.showResult();
        Racing racing = new Racing();
        racing.carReady(inputView.getCarCount());
        racing.carMove(inputView.getCarCount(), inputView.getRaceCount());
    }
}
