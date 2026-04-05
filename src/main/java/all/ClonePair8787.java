package all;

public class ClonePair8787 {

    byte[] method1(byte[] input,int offset,int length){
      byte[] sub=new byte[length];
      for (int i=offset; i < offset + length; i++) {
        sub[i - offset]=input[i];
      }
      return sub;
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
