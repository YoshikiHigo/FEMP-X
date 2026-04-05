package all;

public class ClonePair8195 {

    boolean method1(Object value){
      if (value instanceof Number) {
        return ((Number)value).intValue() != 0;
      }
     else   if (value instanceof String) {
        return Boolean.valueOf((String)value);
      }
     else {
        return Boolean.TRUE.equals(value);
      }
    }

    boolean method2(Object obj){
      if (obj == null) {
        return false;
      }
      if (obj instanceof Boolean) {
        return ((Boolean)obj).booleanValue();
      }
      if (obj instanceof Number) {
        return ((Number)obj).doubleValue() != 0;
      }
      if (obj instanceof String) {
        return ((String)obj).equalsIgnoreCase("true");
      }
      return false;
    }
}
