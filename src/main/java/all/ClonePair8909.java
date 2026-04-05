package all;

public class ClonePair8909 {

    boolean method1(Object value,boolean isRemoveEmptyStrings){
      if (value == null) {
        return false;
      }
     else {
        if (isRemoveEmptyStrings && value instanceof String) {
          return ((String)value).length() > 0;
        }
     else {
          return true;
        }
      }
    }

    boolean method2(Object value,boolean isRemoveEmptyStrings){
      if (value == null) {
        return false;
      }
      if (isRemoveEmptyStrings && value instanceof String) {
        return ((String)value).length() > 0;
      }
      return true;
    }
}
