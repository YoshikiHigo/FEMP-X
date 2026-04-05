package unverified;

public class ClonePair3489 {

    boolean method1(int[] p0,int[] p1){
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

    boolean method2(int[] array1,int[] array2){
      boolean equal=true;
      if (array1.length != array2.length)   return false;
      for (int i=0; i < array2.length; i++) {
        if (array1[i] != array2[i])     return false;
      }
      return equal;
    }
}
