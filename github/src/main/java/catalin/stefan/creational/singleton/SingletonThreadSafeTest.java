package catalin.stefan.creational.singleton;
public class SingletonThreadSafeTest {
  public static void main(String [] args) {
    SingletonThreadSafe threadSafeInstance1 = SingletonThreadSafe.getInstance();
    SingletonThreadSafe threadSafeInstance2 = SingletonThreadSafe.getInstance();

    System.out.println(threadSafeInstance1);
    System.out.println(threadSafeInstance2);
  }
}
