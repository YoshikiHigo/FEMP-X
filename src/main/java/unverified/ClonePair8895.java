package unverified;

public class ClonePair8895 {

    byte[] method1(byte[] data,int off,int len){
      byte[] dd=new byte[len];
      for (int si=off, di=0; si < data.length && di < dd.length; si++, di++)   dd[di]=data[si];
      return dd;
    }

    byte[] method2(byte[] arr,int offset,int bytesToCopy){
      byte[] stuff=new byte[bytesToCopy];
      for (int s=offset, d=0; d < bytesToCopy && s < arr.length; s++, d++) {
        stuff[d]=arr[s];
      }
      return stuff;
    }
}
