import domain.Car;
import service.Condition;
import service.Move;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Condition condition = new Condition();
        List<Car> cars = condition.giveCarName();
//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(cars.get(i).getCarName() + " : " +cars.get(i).getCarLocation());
//        }
//        for (Car car : cars) {
//            System.out.println(car.getCarName() + " : " +car.getCarLocation());
//        }
        int moveCount = condition.giveMoveCount();
        Move move = new Move();
        String winner = move.resultWin(cars, moveCount);

        System.out.println(winner);
    }
}
