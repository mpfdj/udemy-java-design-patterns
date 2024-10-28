package catalin.stefan.structural.composite;

import java.util.ArrayList;

public class Composite extends Equipment {  // Composite is an Equipment as well
  private ArrayList<Equipment> equipments = new ArrayList<>();

  public Composite(String name) {
    super(name, 0);
  }

  public Composite add(Equipment equipment) {
    equipments.add(equipment);
    return this;
  }

  @Override
  public int getPrice() {
    int sum = 0;
    for (Equipment equipment : equipments) {
      sum += equipment.getPrice();  // Recursion here
    }
    return sum;
  }
}
