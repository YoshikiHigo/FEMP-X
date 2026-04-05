package unverified;

public class ClonePair8071 {

    String method1(byte[] data,int offset,int length){
      byte[] stringData=new byte[length];
      System.arraycopy(data,offset,stringData,0,length);
      char[] charArray=new char[length];
      for (int i=0; i < length; i++) {
        charArray[i]=(char)stringData[i];
      }
      return String.valueOf(charArray);
    }

    String method2(byte[] b,int off,int len){
      char[] c=new char[len];
      for (int i=0; i < len; ++i) {
        c[i]=(char)(b[off + i] & 0xff);
      }
      return new String(c);
    }
}
