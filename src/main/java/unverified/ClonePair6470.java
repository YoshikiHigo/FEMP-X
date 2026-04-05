package unverified;

public class ClonePair6470 {

    byte[] method1(float[] in_buff,int in_offset,int in_len,byte[] out_buff,int out_offset){
      int ix=in_offset;
      int ox=out_offset;
      for (int i=0; i < in_len; i++)   out_buff[ox++]=(byte)(127 + in_buff[ix++] * 127.0f);
      return out_buff;
    }

    byte[] method2(float[] in_buff,int in_offset,int in_len,byte[] out_buff,int out_offset){
      int ox=out_offset;
      int len=in_offset + in_len;
      for (int ix=in_offset; ix < len; ix++) {
        int x=(int)(in_buff[ix] * 32767.0);
        out_buff[ox++]=(byte)x;
        out_buff[ox++]=(byte)(x >>> 8);
      }
      return out_buff;
    }
}
