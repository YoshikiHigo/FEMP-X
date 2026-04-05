package all;

public class ClonePair7161 {

    boolean method1(String s1,String s2){
      if ((s1 == null || s1.length() == 0) && (s2 == null || s2.length() == 0)) {
        return true;
      }
      return s1 != null && s2 != null && s1.equals(s2);
    }

    boolean method2(String left,String right){
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
}
