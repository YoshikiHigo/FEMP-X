package unverified;

public class ClonePair7790 {

    Object method1(byte[] buf){
      int n=buf.length / 8;
      double[] a=new double[n];
      int i=0;
      int j=0;
      for (; i < n; ) {
        a[i++]=Double.longBitsToDouble(((long)(buf[j++] & 0xFF) << 56) + ((long)(buf[j++] & 0xFF) << 48) + ((long)(buf[j++] & 0xFF) << 40)+ ((long)(buf[j++] & 0xFF) << 32)+ ((long)(buf[j++] & 0xFF) << 24)+ ((buf[j++] & 0xFF) << 16)+ ((buf[j++] & 0xFF) << 8)+ (buf[j++] & 0xFF));
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
