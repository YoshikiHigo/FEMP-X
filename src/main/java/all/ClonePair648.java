package all;

public class ClonePair648 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1.length == b2.length) {
        for (int ii=0; ii < b1.length; ++ii) {
          if (b1[ii] != b2[ii]) {
            return false;
          }
        }
        return true;
      }
      return false;
    }

    boolean method2(byte[] array1,byte[] array2){
      if (array1.length != array2.length) {
        return false;
      }
      for (int i=0; i < array1.length; i++) {
        if (array1[i] != array2[i]) {
          return false;
        }
      }
      return true;
    }
}
