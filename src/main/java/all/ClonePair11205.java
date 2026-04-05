package all;

public class ClonePair11205 {

    int method1(String first,String second){
      if (null == first) {
        return null == second ? 0 : -1;
      }
      if (null == second) {
        return 1;
      }
      if (first.length() > second.length()) {
        return 1;
      }
      if (first.length() == second.length()) {
        return first.compareTo(second);
      }
      return -1;
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
