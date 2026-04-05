package all;

public class ClonePair13644 {

    byte[] method1(String str){
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

    byte[] method2(String s){
      byte[] b=new byte[s.length() / 2];
      for (int i=0; i < s.length(); i+=2) {
        String j=String.valueOf(s.charAt(i));
        j=j + String.valueOf(s.charAt(i + 1));
        b[i / 2]=(byte)Integer.parseInt(j,16);
      }
      return b;
    }
}
