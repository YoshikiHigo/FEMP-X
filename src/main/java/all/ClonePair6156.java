package all;

public class ClonePair6156 {

    float[] method1(byte[] in_buff,int in_offset,float[] out_buff,int out_offset,int out_len){
      int ix=in_offset;
      int len=out_offset + out_len;
      for (int ox=out_offset; ox < len; ox++) {
        out_buff[ox]=((short)((in_buff[ix++] & 0xFF) | (in_buff[ix++] << 8))) * (1.0f / 32767.0f);
      }
      return out_buff;
    }

    float[] method2(byte[] in_buff,int in_offset,float[] out_buff,int out_offset,int out_len){
      int ix=in_offset;
      int ox=out_offset;
      for (int i=0; i < out_len; i++) {
        int x=(in_buff[ix++] & 0xFF) | ((in_buff[ix++] & 0xFF) << 8);
        out_buff[ox++]=(x - 32767) * (1.0f / 32767.0f);
      }
      return out_buff;
    }
}
