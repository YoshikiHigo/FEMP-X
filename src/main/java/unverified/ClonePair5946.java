package unverified;

public class ClonePair5946 {

    boolean method1(String r,String c){
      if (r == null && c == null) {
        return false;
      }
      if (r != null && c != null) {
        return !r.equals(c);
      }
      return true;
    }

    boolean method2(String str1,String str2){
      if (str1 == null)   return str2 != null;
      if (str2 == null)   return str1 != null;
      return !str1.equals(str2);
    }
}
