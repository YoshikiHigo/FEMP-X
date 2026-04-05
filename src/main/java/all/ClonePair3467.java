package all;

public class ClonePair3467 {

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

    boolean method2(int[] a,int[] b){
      boolean result=false;
      if (a.length == b.length) {
        result=true;
        for (int i=0; i < a.length; i++) {
          if (a[i] != b[i]) {
            result=false;
            break;
          }
        }
      }
      return result;
    }
}
