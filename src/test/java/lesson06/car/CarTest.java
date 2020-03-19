package lesson06.car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

  @Test
  void accelerate() {

    Car victim = new Car("TestCar", "black", 100);

    int expected = 40;

    victim.accelerate(40);

    int actual = victim.getCarCurrentSpeed();

    assertEquals(expected, actual);
  }

  @Test
  void accelerate_doNothingIfCurrentSpeedBigger() {

    Car victim = new Car("TestCar", "black", 100);

    victim.accelerate(50);

    int expected = 50;

    victim.accelerate(40);

    int actual = victim.getCarCurrentSpeed();

    assertEquals(expected, actual);
  }

  @Test
  void accelerate_doNothingIfTargetBiggerThanMaxSpeed() {

    Car victim = new Car("TestCar", "black", 100);

    int expected = 100;

    victim.accelerate(110);

    int actual = victim.getCarCurrentSpeed();

    assertEquals(expected, actual);
  }

  @Test
  void accelerate_untilMaxSpeedIfTargetIsBigger() {

    Car victim = new Car("TestCar", "black", 150);

    int expected = 150;

    victim.accelerate(180);

    int actual = victim.getCarCurrentSpeed();

    assertEquals(expected, actual);
  }

  @Test
  void decelerate() {

    Car victim = new Car("TestCar", "black", 100);

    victim.accelerate(50);

    int expected = 40;

    victim.decelerate(40);

    int actual = victim.getCarCurrentSpeed();

    assertEquals(expected, actual);
  }

  @Test
  void decelerate_doNothingIfCurrentSpeedIsLessThenZero() {

    Car victim = new Car("TestCar", "black", 100);

    int expected = 0;

    victim.decelerate(40);

    int actual = victim.getCarCurrentSpeed();

    assertEquals(expected, actual);
  }

  @Test
  void isDriving() {

    Car victim = new Car("TestCar", "black", 100);

    victim.accelerate(10);

    boolean expected = true;

    boolean actual = victim.isDriving();

    assertEquals(expected, actual);
  }

  @Test
  void isStopped() {

    Car victim = new Car("TestCar", "black", 100);

    boolean expected = true;

    boolean actual = victim.isStopped();

    assertEquals(expected, actual);
  }

  @Test
  void canAccelerate() {

    Car victim = new Car("TestCar", "black", 100);

    boolean expected = true;

    boolean actual = victim.canAccelerate();

    assertEquals(expected, actual);
  }

}