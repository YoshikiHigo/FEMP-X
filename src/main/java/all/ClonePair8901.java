package all;

public class ClonePair8901 {

    byte[] method1(byte[] array,int size){
      byte[] newbuf=new byte[size];
      for (int i=0; i < size; i++) {
        newbuf[i]=array[i];
      }
      return newbuf;
    }

    byte[] method2(byte[] data,int len){
      final byte[] result=new byte[len];
      for (int i=0; i < result.length; i++) {
        result[i]=data[i];
      }
      return result;
    }
}
