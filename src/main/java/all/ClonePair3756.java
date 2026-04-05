package all;

public class ClonePair3756 {

    boolean method1(String a,String b){
      if (a != null && a.trim().length() == 0)   a=null;
      if (b != null && b.trim().length() == 0)   b=null;
      boolean rt=false;
      if (a == b)   return true;
      if (a != null && b != null) {
        if (a.compareTo(b) == 0) {
          return true;
        }
      }
      return rt;
    }

    boolean method2(String str1,String str2){
      if (str1 == null || str1.length() == 0) {
        if (str2 == null || str2.length() == 0) {
          return true;
        }
     else {
          return false;
        }
      }
     else {
        if (str2 == null) {
          return false;
        }
     else {
          return str1.equals(str2);
        }
      }
    }
}
