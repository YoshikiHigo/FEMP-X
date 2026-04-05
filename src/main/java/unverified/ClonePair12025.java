package unverified;

public class ClonePair12025 {

    boolean method1(char c){
    switch (c) {
    case ' ':case '\r':case '\n':case '\t':    return true;
    }
    return false;
    }

    boolean method2(char c){
    switch (c) {
    case (' '):case ('\n'):case ('\t'):case ('\r'):    return true;
    default:  return false;
    }
    }
}
