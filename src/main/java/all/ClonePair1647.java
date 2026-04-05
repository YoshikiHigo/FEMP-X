package all;

public class ClonePair1647 {

    Integer method1(Object value){
      if (value != null) {
        return Integer.parseInt(String.valueOf(value));
      }
      return null;
    }

    Integer method2(Object o){
      if (o == null)   return null;
      if (o instanceof Integer)   return (Integer)o;
      if (o instanceof Number)   return new Integer(((Number)o).intValue());
      return new Integer(o.toString());
    }
}
