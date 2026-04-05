package all;

public class ClonePair8057 {

    String method1(byte[] buffer,int startPos,int length){
      char[] charArray=new char[length];
      int readpoint=startPos;
      for (int i=0; i < length; i++) {
        charArray[i]=(char)buffer[readpoint];
        readpoint++;
      }
      return new String(charArray);
    }

    String method2(byte[] data,int offset,int length){
      byte[] stringData=new byte[length];
      System.arraycopy(data,offset,stringData,0,length);
      char[] charArray=new char[length];
      for (int i=0; i < length; i++) {
        charArray[i]=(char)stringData[i];
      }
      return String.valueOf(charArray);
    }
}
