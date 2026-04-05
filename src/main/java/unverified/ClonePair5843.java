package unverified;

public class ClonePair5843 {

    boolean method1(byte[] b1,int offset1,byte[] b2,int offset2,int length){
      for (int i=0; i < length; i++) {
        if (b1[i + offset1] != b2[i + offset2]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] a1,int offs1,byte[] a2,int offs2,int num){
      int index1=offs1;
      int index2=offs2;
      int count=num;
      while (count-- > 0) {
        if (a1[index1++] != a2[index2++]) {
          return false;
        }
      }
      return true;
    }
}
