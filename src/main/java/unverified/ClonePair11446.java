package unverified;

public class ClonePair11446 {

    long method1(byte[] arr,int idx,int bytenum){
      long n=0;
      for (int i=0; i < bytenum; i++) {
        n<<=8;
        n|=(int)(arr[idx + i] & 0xff);
      }
      return n;
    }

    long method2(byte[] p,int off,int len){
      long ret=0;
      int done=off + len;
      for (int i=off; i < done; i++)   ret=((ret << 8) & 0xffffffff) + (p[i] & 0xff);
      return ret;
    }
}
