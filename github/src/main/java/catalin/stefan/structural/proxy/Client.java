package catalin.stefan.structural.proxy;

public class Client {
  public static void main(String[] args) {
    Image image = new ProxyImage("test.png");  // Use the same interface here

    image.display();
    System.out.println();
    image.display();
  }
}


// Same interface as the original Object
// Similar to Facade, except the Proxy has the same interface
// Similar to Decorator, except the Proxy manages the lifecycle of its Object