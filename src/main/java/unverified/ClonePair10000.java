package unverified;

public class ClonePair10000 {

    boolean method1(char cToCheck){
      if (cToCheck == ' ' || cToCheck == '\r' || cToCheck == '\n' || cToCheck == '\t') {
        return true;
      }
      return false;
    }

    boolean method2(char ch){
      if (ch > 0x20)   return false;
      return ch == 0x9 || ch == 0xA || ch == 0xD || ch == 0x20;
    }
}
