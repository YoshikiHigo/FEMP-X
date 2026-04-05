package unverified;

public class ClonePair10992 {

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

    boolean method2(char ch){
      if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
        return true;
      }
      return false;
    }
}
