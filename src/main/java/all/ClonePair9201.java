package all;

public class ClonePair9201 {

    boolean method1(char c){
      if ('a' <= c && c <= 'z')   return true;
      if ('A' <= c && c <= 'Z')   return true;
      if ('0' <= c && c <= '9')   return true;
      return false;
    }

    boolean method2(char aChar){
      if (((aChar < 'A') || (aChar > 'Z')) && ((aChar < 'a') || (aChar > 'z')) && ((aChar < '0') || (aChar > '9'))) {
        return false;
      }
      return true;
    }
}
