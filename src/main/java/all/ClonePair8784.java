package all;

public class ClonePair8784 {

    byte[] method1(byte[] src,int start,int end){
      final int cells=end - start + 1;
      byte[] n=new byte[cells];
      for (int x=0; x < cells; x++) {
        n[x]=src[x + start];
      }
      return n;
    }

    byte[] method2(byte[] data,int first,int last){
      byte[] temp=new byte[last + 1 - first];
      for (int i=first; i < last + 1; i++)   temp[i - first]=data[i];
      return temp;
    }
}
