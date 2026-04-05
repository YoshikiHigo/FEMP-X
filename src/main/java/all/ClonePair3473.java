package all;

public class ClonePair3473 {

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

    boolean method2(int[] array1,int[] array2){
      boolean equal=true;
      if (array1.length != array2.length)   return false;
      for (int i=0; i < array2.length; i++) {
        if (array1[i] != array2[i])     return false;
      }
      return equal;
    }
}
