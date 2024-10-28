package catalin.stefan.creational.factorymethod;



// Hides design and creation logic from the client
// Many subclass types, only one instance required
// Creation is removed from the client
// Useful for frequent code changes



public class ShapeFactory {

  public Shape getFood(String type) {
    if(type == null) {
      return null;
    }
    switch (type) {
      case "Round": return new Pizza();
      case "Cylinder": return new Burrito();
      default: throw new IllegalArgumentException("Unknown shape");
    }
  }
  
}
