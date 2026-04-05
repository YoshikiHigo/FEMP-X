package unverified;

public class ClonePair11421 {

    long method1(byte[] b,int offset,int size){
      long value=0;
      for (int i=0; i < size; i++) {
        value=(value << 8) | (b[offset + i] & 0xFF);
      }
      return value;
    }

    long method2(byte[] array,int index,int size){
      long result=0;
      for (int i=0; i < size; i++) {
        result<<=8;
        result|=(array[index + i] & 0xFF);
      }
      return result;
    }
}
