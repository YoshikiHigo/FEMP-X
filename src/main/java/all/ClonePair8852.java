package all;

public class ClonePair8852 {

    byte[] method1(byte[] source,int offset,int length){
      byte[] bytes=new byte[length];
      for (int i=0; i < length; i++) {
        if (source.length > offset + i) {
          bytes[i]=source[offset + i];
        }
      }
      return bytes;
    }

    byte[] method2(byte[] data,int off,int len){
      byte[] dd=new byte[len];
      for (int si=off, di=0; si < data.length && di < dd.length; si++, di++)   dd[di]=data[si];
      return dd;
    }
}
