package unverified;

public class ClonePair9979 {

    boolean method1(char cToCheck){
      if (cToCheck == ' ' || cToCheck == '\r' || cToCheck == '\n' || cToCheck == '\t') {
        return true;
      }
      return false;
    }

    boolean method2(char c){
      if (('\t' == c) || ('\n' == c) || ('\r' == c)|| (' ' == c))   return true;
      return false;
    }
}
