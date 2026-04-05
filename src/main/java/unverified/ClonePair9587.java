package unverified;

public class ClonePair9587 {

    boolean method1(char c){
      if ((c >= 65 && c < 91) || (c >= 97 && c < 123)) {
        return true;
      }
     else   if (c >= 48 && c <= 57) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(char c){
      if (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z')) || ((c >= '0') && (c <= '9'))) {
        return true;
      }
     else   return false;
    }
}
