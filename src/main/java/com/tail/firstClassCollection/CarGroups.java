package com.tail.firstClassCollection;

import java.util.List;
import java.util.function.Predicate;

public class CarGroups {
  private List<Car> cars;

  public CarGroups(List<Car> cars) {
    this.cars = cars;
  }

  private Long getHyundaiCarCount() {
    return cars.stream()
      .filter(car -> car.getMaker().equals("Hyundai"))
      .count();
  }

  private Long getKiaCarCount() {
    return cars.stream()
        .filter(car -> car.getMaker().equals("Kia"))
        .count();
  }

  private Long getCarPrices(Predicate<Car> predicate) {
    return cars.stream()
        .filter(predicate)
        .mapToLong(Car::getPrice)
        .sum();
  }

}
