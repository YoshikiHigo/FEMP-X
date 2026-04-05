package all;

public class ClonePair6114 {

    byte method1(byte[] buf,int len){
      byte sum_check=0;
      for (int i=0; i < len; i++) {
        sum_check^=buf[i] & 0xff;
      }
      return sum_check;
    }

    byte method2(byte[] buffer,int bufSize){
      byte tmpCRC=0;
      int i;
      for (i=0; i < bufSize; i++) {
        tmpCRC^=buffer[i];
      }
      return tmpCRC;
    }
}
