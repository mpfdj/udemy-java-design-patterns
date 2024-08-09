package catalin.stefan.creational.builder;

public class ApartmentBuilder {
  private int sqm = -1;
  private int rooms = -1;
  private String city = "";
  private String area = "";
  private boolean kitchen = false;

  public ApartmentBuilder setSqm(int sqm) {
    this.sqm = sqm;
    return this;
  }

  public ApartmentBuilder setRooms(int rooms) {
    this.rooms = rooms;
    return this;
  }

  public ApartmentBuilder setCity(String city) {
    this.city = city;
    return this;
  }

  public ApartmentBuilder setArea(String area) {
    this.area = area;
    return this;
  }

  public ApartmentBuilder setKitchen(boolean kitchen) {
    this.kitchen = kitchen;
    return this;
  }

  public Aparment build() {
    Aparment ap = new Aparment(this.sqm, this.rooms, this.city, this.area, this.kitchen);

    // Below are the Builder properties (not the Apartment ones). Reset the default values here...
    this.sqm = -1;
    this.rooms = -1;
    this.city = "";
    this.area = "";
    this.kitchen = false;
    return ap;
  }

//  WITHOUT USING this.
//  public Aparment build() {
//    Aparment ap = new Aparment(sqm, rooms, city, area, kitchen);
//    sqm = -1;
//    rooms = -1;
//    city = "";
//    area = "";
//    kitchen = false;
//    return ap;
//  }


}
