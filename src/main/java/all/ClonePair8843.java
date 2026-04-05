package all;

public class ClonePair8843 {

    byte[] method1(byte[] data,int offset,int len){
      final byte[] buf=new byte[len];
      for (int i=0; i < buf.length; ++i)   buf[i]=data[offset + i];
      return buf;
    }

    byte[] method2(byte[] message,int start,int count){
      byte[] result=new byte[count];
      int j=0;
      for (int i=start; i < start + count; i++)   result[j++]=message[i];
      return result;
    }
}
