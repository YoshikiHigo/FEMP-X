package unverified;

public class ClonePair7781 {

    Object method1(byte[] buf){
      int n=buf.length / 4;
      int[] a=new int[n];
      int i=0;
      int j=0;
      for (; i < n; ) {
        a[i++]=((buf[j++] & 0xFF) << 24) + ((buf[j++] & 0xFF) << 16) + ((buf[j++] & 0xFF) << 8)+ (buf[j++] & 0xFF);
      }
      return a;
    }

    Object method2(byte[] buf){
      int n=buf.length / 4;
      float[] a=new float[n];
      int i=0;
      int j=0;
      for (; i < n; ) {
        a[i++]=Float.intBitsToFloat(((buf[j++] & 0xFF) << 24) + ((buf[j++] & 0xFF) << 16) + ((buf[j++] & 0xFF) << 8)+ (buf[j++] & 0xFF));
      }
      return a;
    }
}
