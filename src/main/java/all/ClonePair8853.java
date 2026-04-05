package all;

public class ClonePair8853 {

    byte[] method1(byte[] source,int offset,int length){
      byte[] bytes=new byte[length];
      for (int i=0; i < length; i++) {
        if (source.length > offset + i) {
          bytes[i]=source[offset + i];
        }
      }
      return bytes;
    }

    byte[] method2(byte[] arr,int offset,int bytesToCopy){
      byte[] stuff=new byte[bytesToCopy];
      for (int s=offset, d=0; d < bytesToCopy && s < arr.length; s++, d++) {
        stuff[d]=arr[s];
      }
      return stuff;
    }
}
