package racingcar.View;

import racingcar.Model.RacingCar;

import java.util.List;

public class OutputView {
    public void printStartingResult() {
        System.out.println("\n실행 결과");
    }

    public void printRoundResult(List<RacingCar> racingCars) {
        for (RacingCar racingCar : racingCars) {
            System.out.println(racingCar.getCarName() + " : " + "-".repeat(racingCar.getMovingDistance()));
        }
        System.out.println();
    }

    public void printWinners(List<String> winners) {
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
