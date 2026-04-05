package all;

public class ClonePair8124 {

    byte[] method1(char[] tChars,int nSourceOffset,int nLength){
      byte[] tBytes=new byte[nLength];
      for (int n=0; n < nLength; n++) {
        tBytes[n]=(byte)tChars[nSourceOffset + n];
      }
      return tBytes;
    }

    byte[] method2(char[] buffer,int offset,int length){
      byte[] value=new byte[length];
      int index=length - 1;
      while (index >= 0) {
        value[index]=(byte)(buffer[offset + index] & 0xff);
        index--;
      }
      return (value);
    }
}
