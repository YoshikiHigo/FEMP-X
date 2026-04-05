package all;

public class ClonePair8923 {

    boolean method1(char c){
      boolean result=false;
    switch (c) {
    case ' ':case '\t':case '\r':case '\b':case '\n':case '\f':    result=true;
    }
    return result;
    }

    boolean method2(char ch){
      boolean ret=false;
    switch (ch) {
    case '\b':case '\f':case '\n':case '\r':case '\t':case ' ':    ret=true;
      break;
    default:ret=false;
    break;
    }
    return ret;
    }
}
