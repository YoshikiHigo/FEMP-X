package unverified;

public class ClonePair3250 {

    boolean method1(int[] data1,int[] data2){
      if (data1.length != data2.length)   return false;
      for (int ctr=0; ctr < data1.length; ctr++) {
        if (data1[ctr] != data2[ctr])     return false;
      }
      return true;
    }

    boolean method2(int[] p0,int[] p1){
      if (p0.length != p1.length) {
        return false;
      }
      int size=p0.length;
      boolean nonEqual=false;
      for (int x=0; x < size; x++) {
        nonEqual|=!(p0[x] == p1[x]);
      }
      return !nonEqual;
    }
}
