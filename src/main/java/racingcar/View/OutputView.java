package racingcar.View;

import racingcar.Model.RacingCar;

import java.util.List;

public class OutputView {

    public void printRoundResult(List<RacingCar> racingCars) {
        System.out.println("\n실행 결과");
        for (RacingCar racingCar : racingCars) {
            System.out.println(racingCar.getCarName() + " : " + "_".repeat(racingCar.getMovingDistance()));
        }
        System.out.println();
    }

    public void printWinners(List<String> winners) {
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
