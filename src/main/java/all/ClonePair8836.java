package all;

public class ClonePair8836 {

    byte[] method1(byte[] buf,int offset,int len){
      byte[] translated=new byte[len];
      for (int j=0; j < len; j++) {
        byte b=buf[offset + j];
        if (b == '/')     translated[j]=(byte)'.';
     else     translated[j]=b;
      }
      return translated;
    }

    byte[] method2(byte[] message,int start,int count){
      byte[] result=new byte[count];
      int j=0;
      for (int i=start; i < start + count; i++)   result[j++]=message[i];
      return result;
    }
}
