package unverified;

public class ClonePair11733 {

    boolean method1(char c){
    switch (c) {
    case '\n':case '\r':case '\t':case ' ':    return true;
    default:  return false;
    }
    }

    boolean method2(char c){
    switch (c) {
    case ' ':case '\r':case '\n':case '\t':    return true;
    }
    return false;
    }
}
