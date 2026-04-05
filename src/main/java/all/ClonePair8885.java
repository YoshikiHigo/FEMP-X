package all;

public class ClonePair8885 {

    byte[] method1(byte[] buffer,int off,int len){
      byte[] ret=new byte[len];
      for (int i=0; i < len; i++) {
        ret[i]=buffer[off + i];
      }
      return ret;
    }

    byte[] method2(byte[] message,int start,int count){
      byte[] result=new byte[count];
      int j=0;
      for (int i=start; i < start + count; i++)   result[j++]=message[i];
      return result;
    }
}
