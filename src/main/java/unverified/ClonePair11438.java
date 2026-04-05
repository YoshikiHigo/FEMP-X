package unverified;

public class ClonePair11438 {

    long method1(byte[] array,int index,int size){
      long result=0;
      for (int i=0; i < size; i++) {
        result<<=8;
        result|=(array[index + i] & 0xFF);
      }
      return result;
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
