package unverified;

public class ClonePair8050 {

    String method1(byte[] array,int off,int length){
      char[] charArray=new char[length];
      for (int i=0; i < length; i++) {
        charArray[i]=(char)array[off + i];
      }
      return new String(charArray);
    }

    String method2(byte[] b,int off,int len){
      char[] c=new char[len];
      for (int i=0; i < len; ++i) {
        c[i]=(char)(b[off + i] & 0xff);
      }
      return new String(c);
    }
}
