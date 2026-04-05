package unverified;

public class ClonePair7428 {

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

    boolean method2(String a,String b){
      if ((a == null || a.length() == 0) && (b == null || b.length() == 0))   return true;
      if (a == null)   return false;
      return a.equals(b);
    }
}
