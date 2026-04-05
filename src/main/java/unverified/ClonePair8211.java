package unverified;

public class ClonePair8211 {

    boolean method1(Object o){
      if (o == null) {
        return false;
      }
     else   if (o instanceof Boolean) {
        return ((Boolean)o).booleanValue();
      }
     else   if (o instanceof Number) {
        return ((Number)o).doubleValue() != 0;
      }
     else {
        String val=o.toString().trim();
        try {
          return Double.parseDouble(val) != 0;
        }
     catch (    NumberFormatException ex) {
        }
        if (val.equalsIgnoreCase("true")) {
          return true;
        }
     else     if (val.equalsIgnoreCase("false")) {
          return false;
        }
        return false;
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
