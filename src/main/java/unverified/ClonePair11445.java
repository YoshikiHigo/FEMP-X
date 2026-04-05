package unverified;

public class ClonePair11445 {

    long method1(byte[] arr,int idx,int bytenum){
      long n=0;
      for (int i=0; i < bytenum; i++) {
        n<<=8;
        n|=(int)(arr[idx + i] & 0xff);
      }
      return n;
    }

    long method2(byte[] bytes,int pos,int cnt){
      long value=0;
      for (int i=0; i < cnt; i++)   value|=((bytes[pos + cnt - i - 1] & 0xffL) << 8 * i);
      return value;
    }
}
