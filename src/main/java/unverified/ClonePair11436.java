package unverified;

public class ClonePair11436 {

    long method1(byte[] array,int index,int size){
      long result=0;
      for (int i=0; i < size; i++) {
        result<<=8;
        result|=(array[index + i] & 0xFF);
      }
      return result;
    }

    long method2(byte[] bytes,int pos,int cnt){
      long value=0;
      for (int i=0; i < cnt; i++)   value|=((bytes[pos + cnt - i - 1] & 0xffL) << 8 * i);
      return value;
    }
}
