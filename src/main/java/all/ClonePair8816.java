package all;

public class ClonePair8816 {

    byte[] method1(byte[] packet,int start,int stop){
      byte[] ret=new byte[stop - start + 1];
      for (int i=start; i <= stop; i++)   ret[i - start]=packet[i];
      return ret;
    }

    byte[] method2(byte[] data,int first,int last){
      byte[] temp=new byte[last + 1 - first];
      for (int i=first; i < last + 1; i++)   temp[i - first]=data[i];
      return temp;
    }
}
