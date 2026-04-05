package all;

public class ClonePair7855 {

    boolean method1(String numStr,int numBit_n){
      if (numStr != null) {
        if (!"".equals(numStr) && numBit_n > 0) {
          return numStr.matches("\\d{" + numBit_n + "}");
        }
     else {
          return false;
        }
      }
     else {
        return false;
      }
    }

    boolean method2(String value,int length){
      if (value == null) {
        return false;
      }
      int stringLength=value.length();
      if (length != stringLength) {
        return false;
      }
      for (int i=0; i < length; i++) {
        char c=value.charAt(i);
        if (c < '0' || c > '9') {
          return false;
        }
      }
      return true;
    }
}
