package unverified;

public class ClonePair6526 {

    byte[] method1(int input[],int len){
      byte output[]=new byte[len];
      int i=0;
      for (int j=0; j < len; j+=4) {
        output[j]=(byte)(input[i] & 0xff);
        output[j + 1]=(byte)(input[i] >> 8 & 0xff);
        output[j + 2]=(byte)(input[i] >> 16 & 0xff);
        output[j + 3]=(byte)(input[i] >> 24 & 0xff);
        i++;
      }
      return output;
    }

    byte[] method2(int input[],int len){
      int i, j;
      byte output[]=new byte[len];
      for (i=0, j=0; j < len; i++, j+=4) {
        output[j]=(byte)(input[i] & 0xff);
        output[j + 1]=(byte)((input[i] >>> 8) & 0xff);
        output[j + 2]=(byte)((input[i] >>> 16) & 0xff);
        output[j + 3]=(byte)((input[i] >>> 24) & 0xff);
      }
      return output;
    }
}
