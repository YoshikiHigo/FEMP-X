package unverified;

public class ClonePair8884 {

    byte[] method1(byte[] buffer,int off,int len){
      byte[] ret=new byte[len];
      for (int i=0; i < len; i++) {
        ret[i]=buffer[off + i];
      }
      return ret;
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
