package unverified;

public class ClonePair13485 {

    byte[] method1(String hexString){
      int len=hexString.length();
      byte[] bytearray=new byte[len / 2];
      for (int i=0; i < len; i+=2) {
        String nstring="0x" + hexString.substring(i,i + 2);
        int ascii=Integer.decode(nstring);
        bytearray[i / 2]=(byte)ascii;
      }
      return bytearray;
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
