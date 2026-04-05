package unverified;

public class ClonePair9942 {

    @SuppressWarnings("unused") boolean method1(char c){
    switch (c) {
    case ' ':case '\r':case '\n':case '\t':    return true;
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
