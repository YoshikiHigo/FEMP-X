package unverified;

public class ClonePair11736 {

    boolean method1(char c){
    switch (c) {
    case '\n':case '\r':case '\t':case ' ':    return true;
    default:  return false;
    }
    }

    boolean method2(char c){
    switch (c) {
    case (' '):case ('\n'):case ('\t'):case ('\r'):    return true;
    default:  return false;
    }
    }
}
