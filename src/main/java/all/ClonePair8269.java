package all;

public class ClonePair8269 {

    boolean method1(String string1,String string2){
      if (string1 == null) {
        return string2 == null || string2.length() == 0;
      }
      if (string2 == null) {
        return string1.length() == 0;
      }
      return string1.equals(string2);
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
