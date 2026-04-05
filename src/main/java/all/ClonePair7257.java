package all;

public class ClonePair7257 {

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
