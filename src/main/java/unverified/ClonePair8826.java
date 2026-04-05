package unverified;

public class ClonePair8826 {

    byte[] method1(byte[] buf,int offset,int len){
      byte[] translated=new byte[len];
      for (int j=0; j < len; j++) {
        byte b=buf[offset + j];
        if (b == '/')     translated[j]=(byte)'.';
     else     translated[j]=b;
      }
      return translated;
    }

    byte[] method2(byte[] data,int offset,int length){
      byte[] copy=new byte[length];
      for (int i=0; i < copy.length; ++i) {
        copy[i]=data[offset + (length - i - 1)];
      }
      return copy;
    }
}
