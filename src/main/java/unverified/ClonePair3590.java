package unverified;

public class ClonePair3590 {

    Double method1(Object o){
      if (o == null)   return null;
      if (o instanceof Double)   return (Double)o;
      if (o instanceof Number)   return new Double(((Number)o).floatValue());
      return new Double(o.toString());
    }

    Double method2(Object value){
      if (value != null) {
        if (value instanceof Double) {
          return (Double)value;
        }
     else     if (value instanceof Number) {
          return Double.valueOf(((Number)value).doubleValue());
        }
     else {
          double doubleValue=Double.parseDouble(value.toString());
          return Double.valueOf(doubleValue);
        }
      }
      return null;
    }
}
