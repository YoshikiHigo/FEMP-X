package unverified;

public class ClonePair9191 {

    boolean method1(char c){
      if ('a' <= c && c <= 'z')   return true;
      if ('A' <= c && c <= 'Z')   return true;
      if ('0' <= c && c <= '9')   return true;
      return false;
    }

    boolean method2(char c){
      if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9')) {
        return true;
      }
     else {
        return false;
      }
    }
}
