package unverified;

public class ClonePair12545 {

    boolean method1(String ref){
      if (ref == null || ref.trim().length() == 0)   return (false);
      char c;
      for (int i=0; i < ref.length(); i++) {
        c=ref.charAt(i);
        if (!(c >= '0' && c <= '9')) {
          return (false);
        }
      }
      return true;
    }

    boolean method2(String testString){
      boolean retBool=true;
      if (testString != null) {
        for (int i=0; i < testString.length(); i++) {
          char nextChar=testString.charAt(i);
          if (nextChar == '0' || nextChar == '1' || nextChar == '2' || nextChar == '3' || nextChar == '4' || nextChar == '5' || nextChar == '6' || nextChar == '7' || nextChar == '8' || nextChar == '9') {
          }
     else {
            retBool=false;
          }
        }
        if (testString.length() == 0) {
          retBool=false;
        }
      }
     else {
        retBool=false;
      }
      return retBool;
    }
}
