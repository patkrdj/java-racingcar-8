package racingcar.Controller;

import racingcar.Model.RacingGame;
import racingcar.View.InputView;
import racingcar.View.OutputView;

import java.util.List;

public class RacingController {
    public void run() {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        List<String> racingCarNames = inputView.readCarNames();
        int tryCount = inputView.readTryCount();

        RacingGame racingGame = new RacingGame(racingCarNames);
        for (int i = 0; i < tryCount; i++) {
            racingGame.playRound();
            outputView.printRoundResult(racingGame.getRacingCars());
        }

        List<String> winners = racingGame.getWinners();
        outputView.printWinners(winners);
    }
}
