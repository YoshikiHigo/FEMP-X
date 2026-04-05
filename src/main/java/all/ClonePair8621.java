package all;

public class ClonePair8621 {

    boolean method1(Object thisObject,String value,boolean regex){
      if (regex) {
        return Thread.currentThread().getName().matches(value);
      }
     else {
        return Thread.currentThread().getName().equals(value);
      }
    }

    boolean method2(Object thisObject,String value,boolean regex){
      if (regex) {
        return Thread.currentThread().getThreadGroup().getName().matches(value);
      }
     else {
        return Thread.currentThread().getThreadGroup().getName().equals(value);
      }
    }
}
