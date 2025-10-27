package racingcar.View;

import camp.nextstep.edu.missionutils.Console;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputView {

    public List<String> readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String racingCarsString = Console.readLine().trim();
        List<String> racingCars = List.of(racingCarsString.split(","));
        Set<String> set = new HashSet<>();
        for (String racingCar : racingCars) {
            if (!set.add(racingCar)) {
                throw new IllegalArgumentException("자동차 이름이 중복되었습니다.");
            }
        }
        for (String racingCar : racingCars) {
            if (racingCar.length() > 5)
                throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }
        return racingCars;
    }

    public int readTryCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        int tryCount;
        try {
            tryCount = Integer.parseInt(Console.readLine().trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("정수 값을 입력해야 합니다.");
        }
        if (tryCount < 1) throw new IllegalArgumentException("시도 횟수는 양수 값이 되어야 합니다.");
        return tryCount;
    }
}
