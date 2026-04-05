package all;

public class ClonePair13130 {

    byte[] method1(String hexData){
      byte[] result=new byte[(hexData.length() + 1) / 2];
      String hexNumber=null;
      int stringOffset=0;
      int byteOffset=0;
      while (stringOffset < hexData.length()) {
        hexNumber=hexData.substring(stringOffset,stringOffset + 2);
        stringOffset+=2;
        result[byteOffset++]=(byte)Integer.parseInt(hexNumber,16);
      }
      return result;
    }

    byte[] method2(String hexString){
      int len=hexString.length();
      byte[] bytes=new byte[len / 2];
      for (int i=0; i < len; i+=2) {
        int value=Integer.valueOf("00" + hexString.substring(i,i + 2),16);
        bytes[i / 2]=(byte)value;
      }
      return bytes;
    }
}
