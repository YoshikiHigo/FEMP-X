package all;

public class ClonePair12749 {

    short method1(byte[] data,int offset){
      int result=0;
      for (int i=(offset + 1); i >= offset; i--) {
        int temp=0xFF & data[i];
        result=result << 8;
        result=result | temp;
      }
      return (short)(result & 0xFFFF);
    }

    short method2(byte[] buffer,int offset){
      int b1=buffer[offset++];
      int b2=buffer[offset];
      if (b1 < 0) {
        b1+=256;
      }
      return (short)((b2 << 8) | b1);
    }
}
