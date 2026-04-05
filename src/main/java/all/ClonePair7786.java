package all;

public class ClonePair7786 {

    Object method1(byte[] buf){
      int n=buf.length / 8;
      long[] a=new long[n];
      int i=0;
      int j=0;
      for (; i < n; ) {
        a[i++]=((long)(buf[j++] & 0xFF) << 56) + ((long)(buf[j++] & 0xFF) << 48) + ((long)(buf[j++] & 0xFF) << 40)+ ((long)(buf[j++] & 0xFF) << 32)+ ((long)(buf[j++] & 0xFF) << 24)+ ((buf[j++] & 0xFF) << 16)+ ((buf[j++] & 0xFF) << 8)+ (buf[j++] & 0xFF);
      }
      return a;
    }

    Object method2(byte[] buf){
      int n=buf.length / 4;
      int[] a=new int[n];
      int i=0, j=0;
      for (; i < n; ) {
        a[i++]=((buf[j++] & 0xFF) << 24) + ((buf[j++] & 0xFF) << 16) + ((buf[j++] & 0xFF) << 8)+ (buf[j++] & 0xFF);
      }
      return a;
    }
}
