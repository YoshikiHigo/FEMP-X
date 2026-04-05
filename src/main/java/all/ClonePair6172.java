package all;

public class ClonePair6172 {

    float[] method1(byte[] in_buff,int in_offset,float[] out_buff,int out_offset,int out_len){
      int ix=in_offset;
      int ox=out_offset;
      for (int i=0; i < out_len; i++) {
        int x=((in_buff[ix++] & 0xFF) << 16) | ((in_buff[ix++] & 0xFF) << 8) | (in_buff[ix++] & 0xFF);
        x-=0x7FFFFF;
        out_buff[ox++]=x * (1.0f / (float)0x7FFFFF);
      }
      return out_buff;
    }

    float[] method2(byte[] in_buff,int in_offset,float[] out_buff,int out_offset,int out_len){
      int ix=in_offset;
      int ox=out_offset;
      for (int i=0; i < out_len; i++) {
        int x=((in_buff[ix++] & 0xFF) << 16) | ((in_buff[ix++] & 0xFF) << 8) | (in_buff[ix++] & 0xFF);
        if (x > 0x7FFFFF)     x-=0x1000000;
        out_buff[ox++]=x * (1.0f / (float)0x7FFFFF);
      }
      return out_buff;
    }
}
