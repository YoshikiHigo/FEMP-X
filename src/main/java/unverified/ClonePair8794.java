package unverified;

public class ClonePair8794 {

    byte[] method1(byte[] input,int offset,int length){
      byte[] sub=new byte[length];
      for (int i=offset; i < offset + length; i++) {
        sub[i - offset]=input[i];
      }
      return sub;
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
