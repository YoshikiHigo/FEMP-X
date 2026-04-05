package all;

public class ClonePair8842 {

    byte[] method1(byte[] data,int offset,int len){
      final byte[] buf=new byte[len];
      for (int i=0; i < buf.length; ++i)   buf[i]=data[offset + i];
      return buf;
    }

    byte[] method2(byte[] array,int start,int len){
      byte[] buffer=new byte[len];
      for (int x=0; x < len; x++)   buffer[x]=array[start + x];
      return buffer;
    }
}
