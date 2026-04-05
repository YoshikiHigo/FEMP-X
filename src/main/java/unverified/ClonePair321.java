package unverified;

public class ClonePair321 {

    boolean method1(byte[] b1,byte[] b2){
      int size1=b1.length;
      int size2=b2.length;
      if (size1 != size2) {
        return false;
      }
      for (int i=0; i < size1; i++) {
        if (b1[i] != b2[i]) {
          return false;
        }
      }
      return true;
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
