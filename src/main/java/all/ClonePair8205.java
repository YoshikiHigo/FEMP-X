package all;

public class ClonePair8205 {

    boolean method1(String a,String b){
      if ((a == null && b != null) || (a != null && b == null)) {
        return false;
      }
     else {
        return a == b || a.equals(b);
      }
    }

    boolean method2(String str1,String str2){
      if ((str1 == null && str2 != null) || (str1 != null && str2 == null)) {
        return false;
      }
      if (str1 == null && str2 == null) {
        return true;
      }
      if (str1.equals(str2)) {
        return true;
      }
      return false;
    }
}
