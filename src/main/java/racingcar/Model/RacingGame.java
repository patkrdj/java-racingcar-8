package racingcar.Model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private final List<RacingCar> racingCars;

    public RacingGame(List<String> racingCarNames) {
        this.racingCars = new ArrayList<>();
        for (String racingCarName : racingCarNames) {
            racingCars.add(new RacingCar(racingCarName));
        }
    }

    public void playRound() {
        for (RacingCar racingCar : racingCars) {
            if (Randoms.pickNumberInRange(0, 9) >= 4)
                racingCar.move();
        }
    }

    public List<String> getWinners() {
        List<String> winners = new ArrayList<>();
        int winnerDistance = 0;

        for (RacingCar racingCar : racingCars) {
            if (racingCar.getMovingDistance() > winnerDistance) {
                winnerDistance = racingCar.getMovingDistance();
                winners.clear();
                winners.add(racingCar.getCarName());
            }
            else if (racingCar.getMovingDistance() == winnerDistance) {
                winners.add(racingCar.getCarName());
            }
        }

        return winners;
    }

    public List<RacingCar> getRacingCars() {
        return racingCars;
    }
}
