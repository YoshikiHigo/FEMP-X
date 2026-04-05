package all;

public class ClonePair8795 {

    byte[] method1(byte[] data,int offset,int length){
      byte[] copiedBytes=new byte[length];
      for (int i=0; i < copiedBytes.length; i++)   copiedBytes[i]=data[offset + i];
      return copiedBytes;
    }

    byte[] method2(byte[] buf,int offset,int len){
      byte[] translated=new byte[len];
      for (int j=0; j < len; j++) {
        byte b=buf[offset + j];
        if (b == '/')     translated[j]=(byte)'.';
     else     translated[j]=b;
      }
      return translated;
    }
}
