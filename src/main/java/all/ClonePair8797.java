package all;

public class ClonePair8797 {

    byte[] method1(byte[] data,int offset,int length){
      byte[] copiedBytes=new byte[length];
      for (int i=0; i < copiedBytes.length; i++)   copiedBytes[i]=data[offset + i];
      return copiedBytes;
    }

    byte[] method2(byte[] data,int offset,int length){
      byte[] copy=new byte[length];
      for (int i=0; i < copy.length; ++i) {
        copy[i]=data[offset + (length - i - 1)];
      }
      return copy;
    }
}
