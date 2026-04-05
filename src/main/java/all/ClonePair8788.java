package all;

public class ClonePair8788 {

    byte[] method1(byte[] input,int offset,int length){
      byte[] sub=new byte[length];
      for (int i=offset; i < offset + length; i++) {
        sub[i - offset]=input[i];
      }
      return sub;
    }

    byte[] method2(byte[] data,int offset,int length){
      byte[] copy=new byte[length];
      for (int i=0; i < copy.length; ++i) {
        copy[i]=data[offset + (length - i - 1)];
      }
      return copy;
    }
}
