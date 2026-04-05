package unverified;

public class ClonePair10673 {

    boolean method1(char c){
      if (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z')) || ((c >= '0') && (c <= '9')))   return true;
     else   return false;
    }

    boolean method2(char c){
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
}
