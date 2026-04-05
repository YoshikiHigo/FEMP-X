package all;

public class ClonePair1628 {

    Integer method1(Object input){
      if (input == null) {
        return null;
      }
     else   if (input instanceof Double) {
        return ((Double)input).intValue();
      }
     else   if (input instanceof Integer) {
        return (Integer)input;
      }
     else   if (input instanceof String) {
        return null;
      }
     else {
        return null;
      }
    }

    Integer method2(Object o){
      if (o == null || o instanceof Integer) {
        return (Integer)o;
      }
      return null;
    }
}
