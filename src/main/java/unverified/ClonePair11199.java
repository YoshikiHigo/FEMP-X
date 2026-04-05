package unverified;

public class ClonePair11199 {

    boolean method1(char c){
      if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9')) {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(char aChar){
      if (((aChar < 'A') || (aChar > 'Z')) && ((aChar < 'a') || (aChar > 'z')) && ((aChar < '0') || (aChar > '9'))) {
        return false;
      }
      return true;
    }
}
