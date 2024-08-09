package catalin.stefan.creational.singleton;
public class SingletonBillPughTest {
  public static void main(String [] args) {
    SingletonBillPugh billPughInstance1 = SingletonBillPugh.getInstance();
    SingletonBillPugh billPughInstance2 = SingletonBillPugh.getInstance();

    System.out.println(billPughInstance1);
    System.out.println(billPughInstance2);
  }
}
