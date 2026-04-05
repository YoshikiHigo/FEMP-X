package all;

public class ClonePair8200 {

    boolean method1(Object object){
      if (object instanceof Boolean) {
        return ((Boolean)object).booleanValue();
      }
      if (object instanceof Number) {
        return ((Number)object).intValue() != 0;
      }
      return object != null;
    }

    boolean method2(Object keyValue){
      if (keyValue == null)   return false;
      if (keyValue instanceof Integer || keyValue instanceof Short || keyValue instanceof Long|| keyValue instanceof Byte) {
        if (((Number)keyValue).intValue() == 0) {
          return false;
        }
      }
      return true;
    }
}
