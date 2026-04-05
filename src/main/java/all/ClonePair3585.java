package all;

public class ClonePair3585 {

    Double method1(Object value){
      if (value == null) {
        return null;
      }
      if (value instanceof Double) {
        return (Double)value;
      }
      if (value instanceof Number) {
        return Double.valueOf(((Number)value).doubleValue());
      }
      return Double.valueOf(value.toString());
    }

    Double method2(Object o){
      if (o == null)   return null;
      if (o instanceof Double)   return (Double)o;
      if (o instanceof Number)   return new Double(((Number)o).floatValue());
      return new Double(o.toString());
    }
}
