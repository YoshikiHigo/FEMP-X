package unverified;

public class ClonePair8045 {

    String method1(byte[] array,int off,int length){
      char[] charArray=new char[length];
      for (int i=0; i < length; i++) {
        charArray[i]=(char)array[off + i];
      }
      return new String(charArray);
    }

    String method2(byte[] bytes,int offset,int length){
      final char[] c=new char[length];
      for (int i=0; i < c.length; ++i) {
        c[i]=(char)bytes[i + offset];
      }
      return new String(c);
    }
}
