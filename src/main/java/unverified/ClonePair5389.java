package unverified;

public class ClonePair5389 {

    boolean method1(int ascii){
      if (ascii > 0 && ascii < 160) {
        return true;
      }
      return false;
    }

    boolean method2(int month){
      boolean valid=false;
      if (month > 0 && month <= 12) {
        valid=true;
      }
      return valid;
    }
}
