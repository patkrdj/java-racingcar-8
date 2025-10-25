package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // 경주할 자동차의 이름 받기
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String racingCarsString = Console.readLine().trim();
        List<String> racingCars = List.of(racingCarsString.split(","));
        for (String racingCar : racingCars) {
            if (racingCar.length() > 5)
                throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }

        // 시도 횟수 입력받기
        System.out.println("시도할 횟수는 몇 회인가요?");
        int tryCount;
        try {
            tryCount = Integer.parseInt(Console.readLine().trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("정수 값을 입력해야 합니다.");
        }

    }
}
