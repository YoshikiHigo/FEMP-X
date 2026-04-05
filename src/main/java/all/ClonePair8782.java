package all;

public class ClonePair8782 {

    byte[] method1(byte[] src,int start,int end){
      final int cells=end - start + 1;
      byte[] n=new byte[cells];
      for (int x=0; x < cells; x++) {
        n[x]=src[x + start];
      }
      return n;
    }

    byte[] method2(byte[] packet,int start,int stop){
      byte[] ret=new byte[stop - start + 1];
      for (int i=start; i <= stop; i++)   ret[i - start]=packet[i];
      return ret;
    }
}
