package unverified;

public class ClonePair1203 {

    boolean method1(byte[] o1,byte[] o2){
      if (o1.length != o2.length) {
        return false;
      }
     else {
        for (int i=0; i < o1.length; i++) {
          if (o1[i] != o2[i]) {
            return false;
          }
        }
        return true;
      }
    }

    boolean method2(byte[] array1,byte[] array2){
      boolean same=true;
      int len1=array1.length;
      if (len1 == array2.length) {
        int i=0;
        while (i < len1 && same) {
          same=(array1[i] == array2[i]);
          i++;
        }
      }
     else {
        same=false;
      }
      return same;
    }
}
