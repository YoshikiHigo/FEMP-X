package unverified;

public class ClonePair10833 {

    boolean method1(char c){
      if (c == '\n' || c == '\r' || c == '\t' || c == ' ')   return true;
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
