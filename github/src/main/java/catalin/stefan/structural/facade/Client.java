package catalin.stefan.structural.facade;

public class Client {
  public static void main(String[] args) {
    NetworkAccessFacade access = new NetworkAccessFacade();
    access.communicate();
  }
}
