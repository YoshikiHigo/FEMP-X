package all;

public class ClonePair13212 {

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
