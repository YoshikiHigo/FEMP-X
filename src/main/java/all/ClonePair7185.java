package all;

public class ClonePair7185 {

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

    int method2(byte[] b1,int off1,int len1,byte[] b2,int off2,int len2){
      for (int i=0; i < len1 && i < len2; i++) {
        final int d=(b1[off1 + i] & 0xFF) - (b2[off2 + i] & 0xFF);
        if (d != 0) {
          return d;
        }
      }
      return len1 - len2;
    }
}
