package unverified;

public class ClonePair4651 {

    boolean method1(String string1,String string2){
      if (string1 == null && string2 == null) {
        return true;
      }
      if (string1 == null || string2 == null) {
        return false;
      }
      if ((string1.toLowerCase()).equals(string2.toLowerCase())) {
        return true;
      }
     else {
        return false;
      }
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
