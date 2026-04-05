package all;

public class ClonePair7665 {

    boolean method1(Object left,Object right){
      if (left == null || right == null)   return false;
     else {
        if (left instanceof Number && right instanceof Number) {
          Number leftNumber=(Number)left;
          Number rightNumber=(Number)right;
          return leftNumber.doubleValue() > rightNumber.doubleValue();
        }
     else     return false;
      }
    }

    boolean method2(Object lhs,Object rhs){
      if (null == lhs || null == rhs)   return false;
      if (!(lhs instanceof Number) || !(rhs instanceof Number))   return false;
      return ((Number)lhs).doubleValue() > ((Number)rhs).doubleValue();
    }
}
