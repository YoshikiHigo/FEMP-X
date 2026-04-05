package all;

public class ClonePair7137 {

    int method1(byte[] arr,int offset){
      int value=0;
      final int end=offset + 4;
      for (int i=offset, shift=0; i < end; i++, shift+=8) {
        value|=(arr[i] & 0x000000FF) << shift;
      }
      return value;
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
