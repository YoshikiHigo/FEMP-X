package unverified;

public class ClonePair6429 {

    byte[] method1(float[] in_buff,int in_offset,int in_len,byte[] out_buff,int out_offset){
      int ix=in_offset;
      int ox=out_offset;
      for (int i=0; i < in_len; i++) {
        int x=(int)(in_buff[ix++] * 32767.0);
        out_buff[ox++]=(byte)(x >>> 8);
        out_buff[ox++]=(byte)x;
      }
      return out_buff;
    }

    byte[] method2(float[] in_buff,int in_offset,int in_len,byte[] out_buff,int out_offset){
      int ix=in_offset;
      int ox=out_offset;
      for (int i=0; i < in_len; i++) {
        int x=(int)(in_buff[ix++] * (float)0x7FFFFF);
        if (x < 0)     x+=0x1000000;
        out_buff[ox++]=(byte)x;
        out_buff[ox++]=(byte)(x >>> 8);
        out_buff[ox++]=(byte)(x >>> 16);
      }
      return out_buff;
    }
}
