package unverified;

public class ClonePair9539 {

    boolean method1(char c){
      if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')   return true;
      return false;
    }

    boolean method2(char aChar){
      if (((aChar < 'A') || (aChar > 'Z')) && ((aChar < 'a') || (aChar > 'z'))) {
        return false;
      }
      return true;
    }
}
