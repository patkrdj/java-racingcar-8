package racingcar.Model;

public class RacingCar {
    private final String carName;
    private int movingDistance;

    public RacingCar(String carName) {
        this.carName = carName;
        this.movingDistance = 0;
    }

    public void move() {
        movingDistance++;
    }

    public String getCarName() {
        return carName;
    }

    public int getMovingDistance() {
        return movingDistance;
    }
}
