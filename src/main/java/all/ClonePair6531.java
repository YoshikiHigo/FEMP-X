package all;

public class ClonePair6531 {

    byte[] method1(int input[],int len){
      byte[] out=new byte[len];
      int i, j;
      for (i=j=0; j < len; i++, j+=4) {
        out[j]=(byte)(input[i] & 0xff);
        out[j + 1]=(byte)((input[i] >>> 8) & 0xff);
        out[j + 2]=(byte)((input[i] >>> 16) & 0xff);
        out[j + 3]=(byte)((input[i] >>> 24) & 0xff);
      }
      return out;
    }

    byte[] method2(int input[],int len){
      int i, j;
      byte out[];
      out=new byte[len];
      for (i=j=0; j < len; i++, j+=4) {
        out[j]=(byte)(input[i] & 0xff);
        out[j + 1]=(byte)(input[i] >>> 8 & 0xff);
        out[j + 2]=(byte)(input[i] >>> 16 & 0xff);
        out[j + 3]=(byte)(input[i] >>> 24 & 0xff);
      }
      return out;
    }
}
