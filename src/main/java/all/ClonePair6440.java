package all;

public class ClonePair6440 {

    byte[] method1(float[] in_buff,int in_offset,int in_len,byte[] out_buff,int out_offset){
      int ix=in_offset;
      int ox=out_offset;
      for (int i=0; i < in_len; i++) {
        int x=32767 + (int)(in_buff[ix++] * 32767.0);
        out_buff[ox++]=(byte)x;
        out_buff[ox++]=(byte)(x >>> 8);
      }
      return out_buff;
    }

    byte[] method2(float[] in_buff,int in_offset,int in_len,byte[] out_buff,int out_offset){
      int ix=in_offset;
      int ox=out_offset;
      for (int i=0; i < in_len; i++)   out_buff[ox++]=(byte)(127 + in_buff[ix++] * 127.0f);
      return out_buff;
    }
}
