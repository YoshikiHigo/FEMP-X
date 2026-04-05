package all;

public class ClonePair7440 {

    boolean method1(String left,String right){
      boolean ret;
      if ((left == null) && (right == null)) {
        ret=true;
      }
     else   if (right == null && (left != null && left.length() == 0)) {
        ret=true;
      }
     else   if (left == null && (right != null && right.length() == 0)) {
        ret=true;
      }
     else   if ((left == null) || (right == null)) {
        ret=false;
      }
     else {
        ret=left.equals(right);
      }
      return ret;
    }

    boolean method2(String x,String y){
      if (x == y)   return true;
      if (x == null && y != null) {
        if (y.length() == 0)     return true;
        return false;
      }
      if (x != null && y == null) {
        if (x.length() == 0)     return true;
        return false;
      }
      return x.equals(y);
    }
}
