package all;

public class ClonePair5887 {

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

    boolean method2(String oldStr,String newStr){
      if (oldStr == null && newStr != null) {
        return false;
      }
      if (oldStr != null && newStr == null) {
        return false;
      }
      if (oldStr == null && newStr == null) {
        return true;
      }
      if (oldStr.equals(newStr)) {
        return true;
      }
     else {
        return false;
      }
    }
}
