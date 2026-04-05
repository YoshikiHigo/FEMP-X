package unverified;

public class ClonePair7251 {

    boolean method1(String oldStr,String newStr){
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

    boolean method2(String a,String b){
      if ((a == null && b != null) || (a != null && b == null)) {
        return false;
      }
     else {
        return a == b || a.equals(b);
      }
    }
}
