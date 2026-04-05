package unverified;

public class ClonePair7207 {

    int method1(byte[] arr,int start){
      int i=0;
      int len=4;
      int cnt=0;
      byte[] tmp=new byte[len];
      for (i=start; i < start + len; i++) {
        tmp[len - cnt - 1]=arr[i];
        cnt++;
      }
      int accum=0;
      int shiftBy=0;
      for (i=4; i > 0; i--) {
        accum|=((int)(tmp[i - 1] & 0xff)) << shiftBy;
        shiftBy+=8;
      }
      return accum;
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
