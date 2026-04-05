package unverified;

public class ClonePair4705 {

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

    boolean method2(String str1,String str2){
      if ((str1 == null && str2 != null) || (str1 != null && str2 == null)) {
        return false;
      }
      if (str1 == null && str2 == null) {
        return true;
      }
      if (str1.equals(str2)) {
        return true;
      }
      return false;
    }
}
