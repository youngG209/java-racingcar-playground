package beforefeedback.service;

import beforefeedback.domain.Car;

import java.util.*;

public class Move {
    public String resultWin(List<Car> cars, int moveCount) {
        List<Car> carList = new ArrayList<>();
        String topCarString = "";

        for (int i = 0; i < moveCount; i++) {
            carList = moveLocation(cars);
        }

        int maxPosition = getMaxPosition(carList);
        topCarString = getTopCar(carList, topCarString, maxPosition);

        return topCarString;
    }

    private String getTopCar(List<Car> carList, String topCarString, int maxPosition) {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getCarLocation() == maxPosition) {
                if (topCarString == "") {
                    topCarString += carList.get(i).getCarName();
                }else {
                    topCarString += ", " + carList.get(i).getCarName();
                }
            }
        }
        topCarString += "가 최종 우승했습니다.";
        return topCarString;
    }

    private int getMaxPosition(List<Car> carList) {
        Car cars = null;
        int maxPosition = 0;
//        for (int i = 0; i < carList.size(); i++) {
//            if (maxPosition < carList.get(i).getCarLocation()) maxPosition = carList.get(i).getCarLocation();
//        }

        Comparator<Car> comparatorByLocation = Comparator.comparingInt(Car::getCarLocation);

        Car car = carList.stream()
                .max(comparatorByLocation)
                .get();

        maxPosition = car.getCarLocation();

        return maxPosition;
    }

    private List<Car> moveLocation(List<Car> cars) {
        List<Car> result = new ArrayList<>();

        for (Car car : cars) {
            if (moveCondition()) {
                int carLocation = car.getCarLocation() + 1;
                car.setCarLocation(carLocation);
            }
            System.out.println(car.getCarName() + " : " + movePosition(car.getCarLocation()));
            result.add(car);
        }
        System.out.println();
        return result;
    }

    private String movePosition(int count) {
        String position = "";
        for (int i = 0; i < count; i++) {
            position += "-";
        }

        return position;
    }

    private boolean moveCondition() {
        int randomNum = new Random().nextInt(10);
        if (randomNum > 3) {
            return true;
        }
        return false;
    }
}
