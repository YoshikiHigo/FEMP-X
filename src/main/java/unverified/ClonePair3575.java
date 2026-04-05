package unverified;

public class ClonePair3575 {

    Double method1(Object input){
      if (input == null) {
        return null;
      }
     else   if (input instanceof Double) {
        return (Double)input;
      }
     else   if (input instanceof Integer) {
        return ((Integer)input).doubleValue();
      }
     else   if (input instanceof String) {
        return null;
      }
     else {
        return null;
      }
    }

    Double method2(Object value){
      if (value == null) {
        return null;
      }
      if (value instanceof Double) {
        return (Double)value;
      }
     else   if (value instanceof Number) {
        return ((Number)value).doubleValue();
      }
      return null;
    }
}
