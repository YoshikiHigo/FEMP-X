package unverified;

public class ClonePair3466 {

    boolean method1(int[] ssid1,int[] ssid2){
      if (ssid1.length == ssid2.length) {
        for (int i=0; i < ssid1.length; i++) {
          if (ssid1[i] != ssid2[i]) {
            return false;
          }
        }
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(int[] test1,int[] test2){
      boolean isEqual=true;
      if (test1.length != test2.length) {
        isEqual=false;
      }
     else {
        for (int i=0; i < test1.length; i++) {
          if (test1[i] != test2[i]) {
            isEqual=false;
            break;
          }
        }
      }
      return isEqual;
    }
}
