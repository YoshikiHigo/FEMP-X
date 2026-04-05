package all;

public class ClonePair7066 {

    int method1(byte[] data,int offset){
      int i=offset;
      while (data[i++] != 0) {
      }
      return i - offset - 1;
    }

    int method2(byte[] buf,int offset){
      int len=0;
      while (buf[offset + len] != 0)   len++;
      return len;
    }
}
