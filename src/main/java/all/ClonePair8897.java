package all;

public class ClonePair8897 {

    byte[] method1(byte[] message,int start,int count){
      byte[] result=new byte[count];
      int j=0;
      for (int i=start; i < start + count; i++)   result[j++]=message[i];
      return result;
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
