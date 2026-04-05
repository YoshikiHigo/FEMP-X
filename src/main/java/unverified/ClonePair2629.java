package unverified;

public class ClonePair2629 {

    int method1(byte[] bytes){
      int q3=bytes[3] << 24;
      int q2=bytes[2] << 16;
      int q1=bytes[1] << 8;
      int q0=bytes[0];
      if (q2 < 0)   q2+=16777216;
      if (q1 < 0)   q1+=65536;
      if (q0 < 0)   q0+=256;
      return q3 | q2 | q1| q0;
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
