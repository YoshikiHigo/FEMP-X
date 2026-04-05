package all;

public class ClonePair4435 {

    boolean method1(String s1,String s2){
      if (s1 == null)   return ((s2 == null) || s2.equals(""));
      if (s2 == null)   return (s1.equals(""));
      return (s1.equalsIgnoreCase(s2));
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
