package unverified;

public class ClonePair2415 {

    int method1(byte[] intByte){
      int fromByte=0;
      for (int i=0; i < 4; i++) {
        int n=(intByte[i] < 0 ? (int)intByte[i] + 256 : (int)intByte[i]) << (8 * i);
        System.out.println(n);
        fromByte+=n;
      }
      return fromByte;
    }

    int method2(byte[] bytes){
      int q3=bytes[3] << 24;
      int q2=bytes[2] << 16;
      int q1=bytes[1] << 8;
      int q0=bytes[0];
      if (q2 < 0)   q2+=16777216;
      if (q1 < 0)   q1+=65536;
      if (q0 < 0)   q0+=256;
      return q3 | q2 | q1| q0;
    }
}
