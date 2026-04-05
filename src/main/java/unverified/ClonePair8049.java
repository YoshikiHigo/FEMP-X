package unverified;

public class ClonePair8049 {

    String method1(byte[] array,int off,int length){
      char[] charArray=new char[length];
      for (int i=0; i < length; i++) {
        charArray[i]=(char)array[off + i];
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
