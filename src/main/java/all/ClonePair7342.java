package all;

public class ClonePair7342 {

    boolean method1(Object value1,Object value2){
      if (value1 == value2)   return true;
     else   if (value1 == null || value2 == null)   return false;
     else   if (value1.getClass() == value2.getClass())   return value1.equals(value2);
     else   return false;
    }

    boolean method2(Object left,Object right){
      if (left == null && right == null) {
        return true;
      }
      if (left == null || right == null) {
        return false;
      }
      if (left.getClass().getCanonicalName().equals(right.getClass().getCanonicalName())) {
        return left.equals(right);
      }
      return left.toString().equals(right.toString());
    }
}
