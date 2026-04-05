package unverified;

public class ClonePair5941 {

    boolean method1(String r,String c){
      if (r == null && c == null) {
        return false;
      }
      if (r != null && c != null) {
        return !r.equals(c);
      }
      return true;
    }

    boolean method2(String a,String b){
      if (a == null && b == null)   return false;
      if (a == null)   return true;
      if (b == null)   return true;
      return (a.compareTo(b) != 0);
    }
}
