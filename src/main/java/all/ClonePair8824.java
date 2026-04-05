package all;

public class ClonePair8824 {

    byte[] method1(byte[] a,int from,int length){
      if (length <= 0) {
        return null;
      }
      byte[] result=new byte[length];
      System.arraycopy(a,from,result,0,length);
      return result;
    }

    byte[] method2(byte[] buf,int offset,int length){
      if ((offset != -1) && (length > 0)) {
        byte bin[]=new byte[length];
        System.arraycopy(buf,offset,bin,0,length);
        return bin;
      }
     else {
        return null;
      }
    }
}
