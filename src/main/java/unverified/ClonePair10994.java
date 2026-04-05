package unverified;

public class ClonePair10994 {

    boolean method1(char c){
      if ('a' <= c && c <= 'z') {
        return true;
      }
      if ('A' <= c && c <= 'Z') {
        return true;
      }
      if ('0' <= c && c <= '9') {
        return true;
      }
      return false;
    }

    boolean method2(char b){
      if ((b >= 'a') && (b <= 'z'))   return true;
      if ((b >= 'A') && (b <= 'Z'))   return true;
      if ((b >= '0') && (b <= '9'))   return true;
      return false;
    }
}
