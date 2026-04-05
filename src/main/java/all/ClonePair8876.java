package all;

public class ClonePair8876 {

    byte[] method1(byte[] data,int offset,int length){
      byte[] copy=new byte[length];
      for (int i=0; i < copy.length; ++i) {
        copy[i]=data[offset + (length - i - 1)];
      }
      return copy;
    }

    byte[] method2(byte[] buffer,int off,int len){
      byte[] ret=new byte[len];
      for (int i=0; i < len; i++) {
        ret[i]=buffer[off + i];
      }
      return ret;
    }
}
