package unverified;

public class ClonePair10010 {

    boolean method1(char cToCheck){
      if (cToCheck == ' ' || cToCheck == '\r' || cToCheck == '\n' || cToCheck == '\t') {
        return true;
      }
      return false;
    }

    boolean method2(char c){
      boolean result=false;
    switch (c) {
    case ' ':case '\t':case '\n':case '\r':    result=true;
      break;
    default:result=false;
    break;
    }
    return result;
    }
}
