package unverified;

public class ClonePair9980 {

    boolean method1(char cToCheck){
      if (cToCheck == ' ' || cToCheck == '\r' || cToCheck == '\n' || cToCheck == '\t') {
        return true;
      }
      return false;
    }

    boolean method2(char ch){
      if (ch > ' ')   return false;
     else   return ch == '\t' || ch == '\n' || ch == '\r' || ch == ' ';
    }
}
