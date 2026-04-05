package all;

public class ClonePair8841 {

    byte[] method1(byte[] data,int offset,int len){
      final byte[] buf=new byte[len];
      for (int i=0; i < buf.length; ++i)   buf[i]=data[offset + i];
      return buf;
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
