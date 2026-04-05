package unverified;

public class ClonePair9271 {

    Short method1(Object obj){
      if (obj == null)   return null;
      if (obj instanceof Number)   return new Short(((Number)obj).shortValue());
      if (obj instanceof Boolean)   return (obj.equals(Boolean.FALSE)) ? new Short((short)0) : new Short((short)-1);
      try {
        return Short.valueOf(obj.toString());
      }
     catch (  Throwable t) {
      }
      return null;
    }

    Short method2(Object obj){
      if (obj == null) {
        return null;
      }
      if (obj instanceof Number) {
        return new Short(((Number)obj).shortValue());
      }
      if (obj instanceof Boolean) {
        return (obj.equals(Boolean.FALSE)) ? new Short((short)0) : new Short((short)-1);
      }
      try {
        return Short.valueOf(obj.toString());
      }
     catch (  Throwable t) {
      }
      return null;
    }
}
