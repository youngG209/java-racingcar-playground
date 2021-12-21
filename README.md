# 자동차 경주 게임

## 기능 목록

- [X] 자동차는 자동차 이름과 위치 정보를 가지는 Car 객체를 추가해 구현 | Car
  - [X] 자동차 이름 carName
  - [X] 위치 정보 carLocation
- [X] 자동차 이름 및 횟수 | Condition
  - [X] 각 자동차에 이름 부여 giveCarName
  - [X] 전진하는 횟수 입력 giveMoveCount
  - [X] 자동차 이름은 5자를 초과할 수 없음 checkName 
  - [X] 자동차 이름은 쉼표(,)를 기준으로 구분 separateName
- [X] 전진 Move
  - [X] 자동차 위치 | moveLocation
  - [X] 전진하는 조건은 0에서 9사이에서 random 값을 구한 후 random 값이 4 이상일 경우 | moveCondition
- [X] 자동차 경주 게임을 완료한 후 누가 우승했는지 알려줌 | resultWin
  - [X] 우승자는 한명 이상일 수 있음 | getTopCar


## 기능 요구사항
각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
자동차 이름은 쉼표(,)를 기준으로 구분한다.
전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.


## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
