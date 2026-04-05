package all;

public class ClonePair8799 {

    byte[] method1(byte[] data,int offset,int length){
      byte[] copiedBytes=new byte[length];
      for (int i=0; i < copiedBytes.length; i++)   copiedBytes[i]=data[offset + i];
      return copiedBytes;
    }

    byte[] method2(byte[] array,int start,int len){
      byte[] buffer=new byte[len];
      for (int x=0; x < len; x++)   buffer[x]=array[start + x];
      return buffer;
    }
}
