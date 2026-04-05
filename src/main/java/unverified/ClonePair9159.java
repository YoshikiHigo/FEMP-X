package unverified;

public class ClonePair9159 {

    boolean method1(byte b){
      if (b == ' ' || b == '\t' || b == '\r' || b == '\n') {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(byte b){
    switch (b) {
    case 13:case 10:case 32:case 9:    return true;
    }
    return false;
    }
}
