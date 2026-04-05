package unverified;

public class ClonePair8055 {

    String method1(byte[] buffer,int startPos,int length){
      char[] charArray=new char[length];
      int readpoint=startPos;
      for (int i=0; i < length; i++) {
        charArray[i]=(char)buffer[readpoint];
        readpoint++;
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
