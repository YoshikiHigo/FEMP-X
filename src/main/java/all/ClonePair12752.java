package all;

public class ClonePair12752 {

    short method1(byte[] data,int offset){
      int result=0;
      for (int i=(offset + 1); i >= offset; i--) {
        int temp=0xFF & data[i];
        result=result << 8;
        result=result | temp;
      }
      return (short)(result & 0xFFFF);
    }

    short method2(byte[] in,int idx){
      short out=0;
      for (int i=0; i < 2; i++)   out|=((short)in[idx + i] & 0xff) << i * 8;
      return out;
    }
}
