package all;

public class ClonePair5944 {

    boolean method1(String r,String c){
      if (r == null && c == null) {
        return false;
      }
      if (r != null && c != null) {
        return !r.equals(c);
      }
      return true;
    }

    boolean method2(String v1,String v2){
      if (v1 == null && v2 == null)   return false;
      if (v1 == null || v2 == null)   return true;
      return !v1.equals(v2);
    }
}
