package unverified;

public class ClonePair1637 {

    Integer method1(Object obj){
      if (obj == null)   return null;
      if (obj instanceof Number)   return new Integer(((Number)obj).intValue());
      if (obj instanceof Boolean)   return (obj.equals(Boolean.FALSE)) ? new Integer(0) : new Integer(-1);
      try {
        return Integer.valueOf(obj.toString());
      }
     catch (  Throwable t) {
      }
      return null;
    }

    Integer method2(Object o){
      if (o == null || o instanceof Integer) {
        return (Integer)o;
      }
      return null;
    }
}
