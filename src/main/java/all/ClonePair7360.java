package all;

public class ClonePair7360 {

    int method1(byte[] buf,int index){
      int i0=buf[index] & 0xff;
      int i1=buf[index + 1] & 0xff;
      int i2=buf[index + 2] & 0xff;
      int i3=buf[index + 3] & 0xff;
      long convInt=i0 + i1 * 256 + i2 * 65536 + i3 * 16777216;
      if ((convInt & 0x80000000L) == 0x80000000L)   convInt=-(0x100000000L - convInt);
      index+=4;
      return (int)convInt;
    }

    int method2(byte[] in,int idx){
      int out=0;
      for (int i=0; i < 4; i++)   out|=((int)in[idx + i] & 0xff) << i * 8;
      return out;
    }
}
