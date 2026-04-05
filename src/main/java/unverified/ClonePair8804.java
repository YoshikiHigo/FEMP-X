package unverified;

public class ClonePair8804 {

    byte[] method1(byte[] data,int offset,int length){
      byte[] copiedBytes=new byte[length];
      for (int i=0; i < copiedBytes.length; i++)   copiedBytes[i]=data[offset + i];
      return copiedBytes;
    }

    byte[] method2(byte[] arr,int start,int length){
      byte[] arr_out=new byte[length];
      int j=0;
      for (int i=start; i < start + length; i++) {
        arr_out[j]=arr[i];
        j++;
      }
      return arr_out;
    }
}
