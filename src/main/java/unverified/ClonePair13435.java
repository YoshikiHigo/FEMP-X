package unverified;

public class ClonePair13435 {

    byte[] method1(String hexString){
      byte[] bytes=new byte[hexString.length() / 2];
      for (int i=0; i < hexString.length(); i=i + 2) {
        String hex=hexString.substring(i,i + 2);
        int b=Integer.parseInt(hex,16);
        bytes[i / 2]=b > 128 ? (byte)(b - 256) : (byte)b;
      }
      return bytes;
    }

    byte[] method2(String str){
      String strHex="";
      int iValue=0;
      int logByteIndex=0;
      byte bytes[]=new byte[str.length() / 2];
      while (str.length() != 0) {
        strHex=str.substring(0,2);
        str=str.substring(2);
        iValue=(Integer.decode("0x" + strHex).intValue());
        if (iValue > 0x7f) {
          iValue=(iValue - 1) ^ 0xff;
          iValue=-iValue;
        }
        bytes[logByteIndex]=Byte.parseByte(iValue + "");
        logByteIndex++;
      }
      return bytes;
    }
}
