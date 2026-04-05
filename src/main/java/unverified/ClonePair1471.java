package unverified;

public class ClonePair1471 {

    int method1(Object value){
      if (value instanceof Integer) {
        return (Integer)value;
      }
     else {
        return Integer.parseInt(value.toString());
      }
    }

    int method2(Object value){
      if (value instanceof Number) {
        Number n=(Number)value;
        return n.intValue();
      }
      return Integer.parseInt(value.toString());
    }
}
