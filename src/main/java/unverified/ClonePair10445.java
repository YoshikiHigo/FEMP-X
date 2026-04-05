package unverified;

public class ClonePair10445 {

    int method1(String s1,String s2){
      if (s1 == null) {
        return s2 == null ? 0 : -1;
      }
     else   if (s2 == null) {
        return 1;
      }
      return s1.length() < s2.length() ? -1 : s1.length() > s2.length() ? 1 : 0;
    }

    int method2(String str1,String str2){
      int result=0;
      if ((str1 != null) & (str2 != null)) {
        result=str1.compareTo(str2);
        if (result > 0) {
          result=1;
        }
     else     if (result < 0) {
          result=-1;
        }
      }
     else {
        if ((str1 == null) & (str2 == null)) {
          result=0;
        }
     else {
          if (str1 == null) {
            result=-1;
          }
     else {
            result=1;
          }
        }
      }
      return result;
    }
}
