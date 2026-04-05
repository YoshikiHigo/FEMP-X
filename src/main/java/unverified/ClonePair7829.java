package unverified;

public class ClonePair7829 {

    int method1(byte[] ar,byte b,int from){
      for (int i=from; i < ar.length; i++) {
        if (ar[i] == b)     return i;
      }
      return -1;
    }

    int method2(byte[] ary,byte b,int start){
      for (int i=start; i < ary.length; i++) {
        if (b == ary[i]) {
          return i;
        }
      }
      return -1;
    }
}
