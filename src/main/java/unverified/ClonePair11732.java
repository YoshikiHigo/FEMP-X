package unverified;

public class ClonePair11732 {

    boolean method1(char c){
    switch (c) {
    case '\n':case '\r':case '\t':case ' ':    return true;
    default:  return false;
    }
    }

    boolean method2(char c){
    switch (c) {
    case 0x20:case 0x09:case 0x0a:case 0x0d:    return true;
    default:  return false;
    }
    }
}
