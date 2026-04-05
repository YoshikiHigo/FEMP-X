package all;

public class ClonePair13224 {

    byte[] method1(String strIn){
      byte[] arrB=strIn.getBytes();
      int iLen=arrB.length;
      byte[] arrOut=new byte[iLen / 2];
      for (int i=0; i < iLen; i=i + 2) {
        String strTmp=new String(arrB,i,2);
        arrOut[i / 2]=(byte)Integer.parseInt(strTmp,16);
      }
      return arrOut;
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
