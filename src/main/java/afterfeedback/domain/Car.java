package afterfeedback.domain;

import java.util.Objects;
import java.util.Random;

public class Car {
    private static final int FORWARD_NUM = 4;
    private static final int MAX_BOUND = 10;

    private final Name name;
    private Position position;

    public Car(final String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public int getPosition() {
        return position.getPosition();
    }

    public void move() {
        if (getRandomNo() >= FORWARD_NUM) {
            position.move();
        }
    }

    public void move(MovingStratege movingStratege) {
        if (movingStratege.movable()) {
            position.move();
        }
    }

    protected int getRandomNo() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
