package unverified;

public class ClonePair7277 {

    int method1(byte[] bytes,int offset){
      int ret=0;
      for (int i=3; i >= 0; i--) {
        ret<<=8;
        ret|=bytes[offset + i] & 0xFF;
      }
      return ret;
    }

    int method2(byte[] buf,int index){
      int i0=buf[index] & 0xff;
      int i1=buf[index + 1] & 0xff;
      int i2=buf[index + 2] & 0xff;
      int i3=buf[index + 3] & 0xff;
      long convInt=i0 + i1 * 256 + i2 * 65536 + i3 * 16777216;
      if ((convInt & 0x80000000L) == 0x80000000L)   convInt=-(0x100000000L - convInt);
      index+=4;
      return (int)convInt;
    }
}
