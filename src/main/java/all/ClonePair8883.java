package all;

public class ClonePair8883 {

    byte[] method1(byte[] buffer,int off,int len){
      byte[] ret=new byte[len];
      for (int i=0; i < len; i++) {
        ret[i]=buffer[off + i];
      }
      return ret;
    }

    byte[] method2(byte[] array,int start,int len){
      byte[] buffer=new byte[len];
      for (int x=0; x < len; x++)   buffer[x]=array[start + x];
      return buffer;
    }
}
