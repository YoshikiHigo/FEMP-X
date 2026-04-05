package unverified;

public class ClonePair5844 {

    boolean method1(byte[] b1,int offset1,byte[] b2,int offset2,int length){
      for (int i=0; i < length; i++) {
        if (b1[i + offset1] != b2[i + offset2]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] key1,int off1,byte[] key2,int off2,int len){
      for (int i=0; i < len; i++) {
        if (key1[i + off1] != key2[i + off2])     return false;
      }
      return true;
    }
}
