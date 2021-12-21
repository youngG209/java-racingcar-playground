package beforeFeedback.service;

import beforeFeedback.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Condition {
    public List<Car> giveCarName() {

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분). : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        List<Car> players = new ArrayList<>();

        for (String name : input.split(",")) {
            Car car = new Car();
            if (checkName(name)) {
                System.out.println(name + " 이 5자를 초과하였습니다. 다시 입력해 주세요");
                giveCarName();
            }
            car.setCarName(name);
            car.setCarLocation(0);
            players.add(car);
        }
        return players;
    }

    public int giveMoveCount() {
        System.out.println("시도할 회수는 몇회인가요? : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        int moveCount = Integer.parseInt(input);

        return moveCount;
    }

    private boolean checkName(String name) {
        return name.length() > 5;
    }
}
