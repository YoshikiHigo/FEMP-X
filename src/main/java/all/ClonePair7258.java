package all;

public class ClonePair7258 {

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
      boolean result=a == null && b == null;
      if (!result) {
        result=a != null && b != null && a.equals(b);
      }
      return result;
    }
}
