package lesson6.car;

import java.util.Objects;

public class Car {

  private String carModel;
  private String carColor;
  private int carMaxSpeed;
  private int carCurrentSpeed;

  public Car(String carModel, String carColor, int carMaxSpeed, int carCurrentSpeed) {
    this.carModel = carModel;
    this.carColor = carColor;
    this.carMaxSpeed = carMaxSpeed;
    this.carCurrentSpeed = carCurrentSpeed;
  }

  public boolean isDriving() {
      if (this.carCurrentSpeed > 0) {
        return true;
      } else {
        return false;
      }
  }

  public boolean isStopped() {
    if (this.carCurrentSpeed == 0) {
      return true;
    } else {
      return false;
    }
  }

  public boolean canAccelerate() {
    if (this.carCurrentSpeed < carMaxSpeed) {
      return true;
    } else {
      return false;
    }
  }

  public int getCarCurrentSpeed() {
    return carCurrentSpeed;
  }

  public void accelerate(int targetSpeed) {
    while ((carCurrentSpeed < targetSpeed) && (targetSpeed <= carMaxSpeed) && (carCurrentSpeed != carMaxSpeed))  {
      carCurrentSpeed++;
    }
  }

  public void decelerate(int targetSpeed) {

    while ((carCurrentSpeed > targetSpeed) && carCurrentSpeed != 0) {
      carCurrentSpeed--;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Car car = (Car) o;
    return carMaxSpeed == car.carMaxSpeed &&
            carCurrentSpeed == car.carCurrentSpeed &&
            carModel.equals(car.carModel) &&
            carColor.equals(car.carColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carModel, carColor, carMaxSpeed, carCurrentSpeed);
  }

  @Override
  public String toString() {
    return "Car{" +
            "carModel='" + carModel + '\'' +
            ", carColor='" + carColor + '\'' +
            ", carMaxSpeed=" + carMaxSpeed +
            ", carCurrentSpeed=" + carCurrentSpeed +
            '}';
  }
}
