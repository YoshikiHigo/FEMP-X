package all;

public class ClonePair8887 {

    byte[] method1(byte[] buffer,int off,int len){
      byte[] ret=new byte[len];
      for (int i=0; i < len; i++) {
        ret[i]=buffer[off + i];
      }
      return ret;
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
