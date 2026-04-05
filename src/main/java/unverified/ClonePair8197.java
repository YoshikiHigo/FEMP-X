package unverified;

public class ClonePair8197 {

    boolean method1(Object groupBy){
      if (groupBy == null) {
        return false;
      }
      if (groupBy instanceof Number) {
        Number num=(Number)groupBy;
        if (num.longValue() == 0) {
          return false;
        }
      }
      return true;
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
