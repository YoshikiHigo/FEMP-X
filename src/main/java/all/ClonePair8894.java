package all;

public class ClonePair8894 {

    byte[] method1(byte[] data,int beginat,int count){
      byte[] answer=new byte[count];
      int srcidx=beginat;
      for (int destidx=0; destidx < count; destidx++) {
        answer[destidx]=data[srcidx];
        srcidx++;
      }
      return answer;
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
