package all;

public class ClonePair8880 {

    byte[] method1(byte[] data,int offset,int length){
      byte[] copy=new byte[length];
      for (int i=0; i < copy.length; ++i) {
        copy[i]=data[offset + (length - i - 1)];
      }
      return copy;
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
