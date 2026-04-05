package all;

public class ClonePair5947 {

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
      if ((str1 == null) && (str2 == null))   return false;
      if (str1 == null)   return true;
      if (str2 == null)   return true;
      return !str1.equals(str2);
    }
}
