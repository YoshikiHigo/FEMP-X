package unverified;

public class ClonePair1463 {

    int method1(Object obj){
      if (obj instanceof Integer) {
        return (Integer)obj;
      }
      return Integer.parseInt(obj.toString());
    }

    int method2(Object value){
      if (value instanceof Number) {
        Number n=(Number)value;
        return n.intValue();
      }
      return Integer.parseInt(value.toString());
    }
}
