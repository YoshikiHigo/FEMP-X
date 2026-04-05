package unverified;

public class ClonePair7184 {

    int method1(byte[] b1,int s1,int l1,byte[] b2,int s2,int l2){
      int end1=s1 + l1;
      int end2=s2 + l2;
      for (int i=s1, j=s2; i < end1 && j < end2; i++, j++) {
        int a=(b1[i] & 0xff);
        int b=(b2[j] & 0xff);
        if (a != b) {
          return a - b;
        }
      }
      return l1 - l2;
    }

    int method2(byte[] a,int aoff,int alen,byte[] b,int boff,int blen){
      int compareLen=alen < blen ? alen : blen;
      for (int i=0; i < compareLen; ++i) {
        int curA=a[aoff + i] & 0xFF;
        int curB=b[boff + i] & 0xFF;
        if (curA != curB)     return curA - curB;
      }
      return alen - blen;
    }
}
