package all;

public class ClonePair5971 {

    boolean method1(String i1,String i2){
      if (i1.length() != 0 && !i1.equals("none") && !i1.equals(i2))   return false;
      return true;
    }

    boolean method2(String a,String b){
      if (a == b) {
        return true;
      }
      if (a.length() != b.length())   return false;
      int n=a.length();
      if (n == b.length()) {
        for (int i=n - 1; i >= 0; i--) {
          if (a.charAt(i) != b.charAt(i)) {
            return false;
          }
        }
      }
      return true;
    }
}
