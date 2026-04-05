package unverified;

public class ClonePair5685 {

    boolean method1(int ch){
    switch (ch) {
    case ' ':case '\n':case '\r':case '\t':    return true;
    default:  return false;
    }
    }

    boolean method2(int target){
      if (target == 0x0d || target == 0x0a || target == 0x20 || target == 0x09)   return true;
      return false;
    }
}
