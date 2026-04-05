package all;

public class ClonePair9157 {

    boolean method1(byte b){
      if (b == ' ' || b == '\t' || b == '\r' || b == '\n') {
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(byte byteToCheck){
    switch (byteToCheck) {
    case ' ':case '\n':case '\r':case '\t':    return true;
    default:  return false;
    }
    }
}
