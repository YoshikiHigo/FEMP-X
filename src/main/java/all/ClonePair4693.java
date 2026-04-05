package all;

public class ClonePair4693 {

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

    boolean method2(String one,String two){
      if (one == null && two == null) {
        return true;
      }
      if (one == null || two == null) {
        return false;
      }
      return one.compareTo(two) == 0;
    }
}
