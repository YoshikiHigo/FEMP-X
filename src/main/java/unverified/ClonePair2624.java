package unverified;

public class ClonePair2624 {

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

    int method2(byte[] bytes){
      int value=0;
      for (int i=0; i < 4; i++) {
        int x=(bytes[i] << i * 8) & (0xFF << i * 8);
        value+=x;
      }
      return value;
    }
}
