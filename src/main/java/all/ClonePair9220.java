package all;

public class ClonePair9220 {

    char[] method1(byte[] tBytes,int nLength){
      char[] tChars=new char[nLength];
      for (int n=0; n < nLength; n++) {
        tChars[n]=(char)tBytes[n];
      }
      return tChars;
    }

    char[] method2(byte[] buff,int length){
      char[] charBuff=new char[length];
      for (int i=0; i < length; ++i) {
        charBuff[i]=(char)(buff[i] & 0xFF);
      }
      return charBuff;
    }
}
