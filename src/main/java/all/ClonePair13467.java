package all;

public class ClonePair13467 {

    byte[] method1(String iStr){
      byte[] outArr=new byte[iStr.length() / 2];
      for (int i=0; i < iStr.length(); i+=2) {
        String hex=iStr.substring(i,i + 2);
        byte b=(byte)((int)Integer.parseInt(hex,16) & 0xFF);
        outArr[i / 2]=b;
      }
      return outArr;
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
