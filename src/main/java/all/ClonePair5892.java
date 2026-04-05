package all;

public class ClonePair5892 {

    boolean method1(String str1,String str2){
      boolean match=false;
      if (str1 == null && str2 == null) {
        match=true;
      }
     else   if (str1 == null || str2 == null) {
        match=false;
      }
     else   if (str1.equals(str2)) {
        match=true;
      }
      return match;
    }

    boolean method2(String a,String b){
      if ((a == null && b != null) || (a != null && b == null)) {
        return false;
      }
     else {
        return a == b || a.equals(b);
      }
    }
}
