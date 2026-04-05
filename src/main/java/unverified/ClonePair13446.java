package unverified;

public class ClonePair13446 {

    byte[] method1(String rendered){
      byte[] result=new byte[rendered.length() / 2];
      for (int byteIndex=0; byteIndex < result.length; byteIndex++) {
        String byteStr=rendered.substring(byteIndex * 2,byteIndex * 2 + 2);
        int byteAsSignedInt=Integer.parseInt(byteStr,16);
        if (0X7f < byteAsSignedInt) {
          result[byteIndex]=(byte)byteAsSignedInt;
        }
     else {
          result[byteIndex]=(byte)(-0x100 + byteAsSignedInt);
        }
      }
      return result;
    }

    byte[] method2(String string){
      byte[] bytes=new byte[string.length() / 2];
      int pos=0;
      byte upper, lower;
      int buffer;
      for (int i=0; (i + 1) < string.length(); i+=2) {
        upper=Byte.decode("0x0" + string.charAt(i));
        lower=Byte.decode("0x0" + string.charAt(i + 1));
        buffer=(upper << 4) | lower;
        bytes[pos++]=(byte)buffer;
      }
      return bytes;
    }
}
