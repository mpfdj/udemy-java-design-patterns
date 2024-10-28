package catalin.stefan.structural.bridge;

public class Instagram implements App {

  PhoneOS os;  // This is the Bridge to the OS


  public Instagram(PhoneOS os) {
    this.os = os;
  }

  @Override
  public void runApp() {
    System.out.println();
    os.display("cached data");
    os.upload("instagram.com");
    os.display("instagram data");
    os.display("fresh data");
    System.out.println();
  }

  
  
}
