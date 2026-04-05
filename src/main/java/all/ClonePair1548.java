package all;

public class ClonePair1548 {

    boolean method1(byte[] left,byte[] right){
      if (left == null) {
        return ((right == null) ? true : false);
      }
      if (right == null) {
        return ((left == null) ? true : false);
      }
      if (left.length != right.length)   return false;
      for (int i=0; i < left.length; i++) {
        if (left[i] != right[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] data1,byte[] data2){
      if (data1 == data2)   return true;
      if (data1 == null || data2 == null)   return false;
      if (data1.length != data2.length)   return false;
      for (int i=0; i < data1.length; i++) {
        if (data1[i] != data2[i])     return false;
      }
      return true;
    }
}
