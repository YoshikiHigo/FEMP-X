package all;

public class ClonePair11439 {

    long method1(byte[] array,int index,int size){
      long result=0;
      for (int i=0; i < size; i++) {
        result<<=8;
        result|=(array[index + i] & 0xFF);
      }
      return result;
    }

    long method2(byte[] b,int offset,int size){
      long l=0;
      for (int i=0; i < size; ++i)   l|=((long)b[offset + i] & 0xff) << ((size - i - 1) << 3);
      return l;
    }
}
