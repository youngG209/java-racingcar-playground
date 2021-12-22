package afterfeedback.domain;

import java.util.Objects;

public class Position {
    private int position;

    public Position() {
        this(0);
    }

    public Position(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("position은 음수 값을 가질 수 없습니다.");
        }
        this.position = position;
    }

//    불변 객체 : 한번 인스턴스가 만들어지면 이 값은 절대 외부에 의해서 값이 변경될 수 없다.
//               하기 값은 값이 변경 되는 것이 아닌 새로운 값을 만드는것
//    불변 객체의 단점 : 새로운 인스턴스를 만들어 가비지 콜랙션이 발생하여 성능이 떨어질 수 있음
//    public Position move() {
//        return new Position(position + 1);
//    }

//    가변 객체 : 매번 인스턴스를 만들지 않음
    public void move() {
        position = position + 1;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
