package unverified;

public class ClonePair9221 {

    char[] method1(byte[] buff,int length){
      char[] charBuff=new char[length];
      for (int i=0; i < length; ++i) {
        charBuff[i]=(char)(buff[i] & 0xFF);
      }
      return charBuff;
    }

    char[] method2(byte[] a,int newLength){
      char[] result=new char[newLength];
      for (int i=0; i < newLength; i++)   result[i]=(char)a[i];
      return result;
    }
}
