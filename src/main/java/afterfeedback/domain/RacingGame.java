package afterfeedback.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private final List<Car> cars;
    private int tryNo;

    public RacingGame(List<Car> cars, int tryNo) {
        this.cars = cars;
        this.tryNo = tryNo;
    }

    private static List<Car> initCars(String carNames) {
        if (carNames == null || carNames == "") {
            throw new IllegalArgumentException("자동차 이름은 값이 존재해야 합니다.");
        }
        String[] names = carNames.split(",");
        List<Car> cars = new ArrayList<>();
        for (String name : names) {
            cars.add(new Car(name));
        }
        return cars;
    }

    public void race() {
        this.tryNo--;
        moveCars();
    }

    private void moveCars2() {
        for (Car car: cars) {
            car.move(new RandomMovingStratege());
        }
    }

    private void moveCars() {
        for (Car car: cars) {
            car.move();
        }
    }
}
