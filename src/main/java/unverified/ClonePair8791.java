package unverified;

public class ClonePair8791 {

    byte[] method1(byte[] input,int offset,int length){
      byte[] sub=new byte[length];
      for (int i=offset; i < offset + length; i++) {
        sub[i - offset]=input[i];
      }
      return sub;
    }

    byte[] method2(byte[] data,int beginat,int count){
      byte[] answer=new byte[count];
      int srcidx=beginat;
      for (int destidx=0; destidx < count; destidx++) {
        answer[destidx]=data[srcidx];
        srcidx++;
      }
      return answer;
    }
}
