package all;

public class ClonePair8058 {

    String method1(byte[] buffer,int startPos,int length){
      char[] charArray=new char[length];
      int readpoint=startPos;
      for (int i=0; i < length; i++) {
        charArray[i]=(char)buffer[readpoint];
        readpoint++;
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
