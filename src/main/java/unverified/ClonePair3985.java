package unverified;

public class ClonePair3985 {

    boolean method1(String uri1,String uri2){
      if (uri1 == uri2) {
        return true;
      }
      if (uri1 == null) {
        return (uri2.length() == 0);
      }
      if (uri2 == null) {
        return (uri1.length() == 0);
      }
      return uri1.equals(uri2);
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
