package unverified;

public class ClonePair8061 {

    String method1(byte[] bytes,int offset,int length){
      final char[] c=new char[length];
      for (int i=0; i < c.length; ++i) {
        c[i]=(char)bytes[i + offset];
      }
      return new String(c);
    }

    String method2(byte[] b,int off,int len){
      char[] c=new char[len];
      for (int i=0; i < len; ++i) {
        c[i]=(char)(b[off + i] & 0xff);
      }
      return new String(c);
    }
}
