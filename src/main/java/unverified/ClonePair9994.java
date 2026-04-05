package unverified;

public class ClonePair9994 {

    boolean method1(char cToCheck){
      if (cToCheck == ' ' || cToCheck == '\r' || cToCheck == '\n' || cToCheck == '\t') {
        return true;
      }
      return false;
    }

    boolean method2(char ch){
      if (ch == 32) {
        return true;
      }
     else   if (ch == 10) {
        return true;
      }
     else   if (ch == 13) {
        return true;
      }
     else   if (ch == 9) {
        return true;
      }
      return false;
    }
}
