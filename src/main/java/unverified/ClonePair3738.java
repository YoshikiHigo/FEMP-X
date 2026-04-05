package unverified;

public class ClonePair3738 {

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
