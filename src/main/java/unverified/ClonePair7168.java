package unverified;

public class ClonePair7168 {

    boolean method1(String s1,String s2){
      if ((s1 == null || s1.length() == 0) && (s2 == null || s2.length() == 0)) {
        return true;
      }
      return s1 != null && s2 != null && s1.equals(s2);
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
