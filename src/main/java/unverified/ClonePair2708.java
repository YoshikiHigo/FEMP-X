package unverified;

public class ClonePair2708 {

    int method1(byte[] b){
      int s=0;
      for (int i=0; i < 3; i++) {
        if (b[3 - i] >= 0) {
          s=s + b[3 - i];
        }
     else {
          s=s + 256 + b[3 - i];
        }
        s=s * 256;
      }
      if (b[0] >= 0) {
        s=s + b[0];
      }
     else {
        s=s + 256 + b[0];
      }
      return s;
    }

    int method2(byte[] p){
      int[] tmp=new int[4];
      if (p[0] < 0)   tmp[0]=p[0] + 256;
     else   tmp[0]=p[0];
      if (p[1] < 0)   tmp[1]=p[1] + 256;
     else   tmp[1]=p[1];
      if (p[2] < 0)   tmp[2]=p[2] + 256;
     else   tmp[2]=p[2];
      if (p[3] < 0)   tmp[3]=p[3] + 256;
     else   tmp[3]=p[3];
      int v=(256 * 256 * 256* tmp[3]) + (256 * 256 * tmp[2]) + (256 * tmp[1])+ tmp[0];
      return v;
    }
}
