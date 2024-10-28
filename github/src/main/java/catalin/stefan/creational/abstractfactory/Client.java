package catalin.stefan.creational.abstractfactory;


// One extra layer of abstraction on top of the Factory pattern
// A factory of factories


public class Client {
  private Service service;
  private Response response;

  public Client(DataSourceAbstractFactory factory) {
    service = factory.createService();
    response = factory.createResponse();
  }

  public void communicate() {
    if(service != null && response != null) {
      System.out.println(service.runService());
      System.out.println(response.getResponse());
    }
  }
}
