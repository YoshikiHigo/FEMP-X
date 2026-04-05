package all;

public class ClonePair6529 {

    byte[] method1(int input[],int len){
      final byte[] out=new byte[len];
      int i, j;
      for (i=j=0; j < len; i++, j+=4) {
        out[j]=(byte)(input[i] & 0xff);
        out[j + 1]=(byte)(input[i] >>> 8 & 0xff);
        out[j + 2]=(byte)(input[i] >>> 16 & 0xff);
        out[j + 3]=(byte)(input[i] >>> 24 & 0xff);
      }
      return out;
    }

    byte[] method2(int input[],int len){
      byte output[]=new byte[len];
      int i=0;
      int j=0;
      for (; j < len; i++, j+=4) {
        output[j]=(byte)((input[i]) & 0xff);
        output[j + 1]=(byte)((input[i] >> 8) & 0xff);
        output[j + 2]=(byte)((input[i] >> 16) & 0xff);
        output[j + 3]=(byte)((input[i] >> 24) & 0xff);
      }
      return output;
    }
}
