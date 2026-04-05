package unverified;

public class ClonePair9033 {

    boolean method1(char ch){
      boolean ret=false;
    switch (ch) {
    case '\b':case '\f':case '\n':case '\r':case '\t':case ' ':    ret=true;
      break;
    default:ret=false;
    break;
    }
    return ret;
    }

    boolean method2(char c){
      if ('\b' == c || '\t' == c || '\n' == c || '\f' == c || '\r' == c || ' ' == c) {
        return true;
      }
      return false;
    }
}
