package all;

public class ClonePair8840 {

    byte[] method1(byte[] data,int offset,int len){
      final byte[] buf=new byte[len];
      for (int i=0; i < buf.length; ++i)   buf[i]=data[offset + i];
      return buf;
    }

    byte[] method2(byte[] buffer,int off,int len){
      byte[] ret=new byte[len];
      for (int i=0; i < len; i++) {
        ret[i]=buffer[off + i];
      }
      return ret;
    }
}
