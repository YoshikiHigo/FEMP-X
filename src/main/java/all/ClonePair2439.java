package all;

public class ClonePair2439 {

    int method1(byte[] byte_array_4){
      int ret=0;
      for (int i=0; i < 4; i++) {
        int b=(int)byte_array_4[i];
        if (i < 3 && b < 0) {
          b=256 + b;
        }
        ret+=b << (i * 8);
      }
      return ret;
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
