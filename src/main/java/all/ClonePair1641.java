package all;

public class ClonePair1641 {

    Integer method1(Object value){
      if (value == null) {
        return null;
      }
      if (value instanceof Integer) {
        return (Integer)value;
      }
      if (value instanceof Number) {
        return Integer.valueOf(((Number)value).intValue());
      }
      return Integer.valueOf(value.toString());
    }

    Integer method2(Object o){
      if (o == null)   return null;
      if (o instanceof Integer)   return (Integer)o;
      if (o instanceof Number)   return new Integer(((Number)o).intValue());
      return new Integer(o.toString());
    }
}
