package unverified;

public class ClonePair12035 {

    boolean method1(char c){
      boolean result=false;
    switch (c) {
    case ' ':case '\t':case '\n':case '\r':    result=true;
      break;
    default:result=false;
    break;
    }
    return result;
    }

    boolean method2(char c){
    switch (c) {
    case (' '):case ('\n'):case ('\t'):case ('\r'):    return true;
    default:  return false;
    }
    }
}
