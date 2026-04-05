package unverified;

public class ClonePair5723 {

    boolean method1(int c){
      if (c == ' ' || c == '\t' || c == '\r' || c == '\n')   return true;
      return false;
    }

    boolean method2(int target){
      if (target == 0x0d || target == 0x0a || target == 0x20 || target == 0x09)   return true;
      return false;
    }
}
