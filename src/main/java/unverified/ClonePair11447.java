package unverified;

public class ClonePair11447 {

    long method1(byte[] arr,int idx,int bytenum){
      long n=0;
      for (int i=0; i < bytenum; i++) {
        n<<=8;
        n|=(int)(arr[idx + i] & 0xff);
      }
      return n;
    }

    long method2(byte[] b,int offset,int size){
      long num=0;
      long sw=8L * ((long)size - 1L);
      for (int loop=0; loop < size; loop++) {
        num|=((long)b[offset + loop] & 0x00ff) << sw;
        sw-=8;
      }
      return num;
    }
}
