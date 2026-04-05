package unverified;

public class ClonePair6684 {

    boolean method1(String s1,String s2){
      if (s1 == null)   return s2 == null || s2.equals("");
      if (s2 == null)   return s1.equals("");
      return s1.equals(s2);
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
