package unverified;

public class ClonePair13218 {

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
      byte[] myByte=new byte[hexString.length() / 2];
      for (int x=0; x < hexString.length(); x+=2) {
        int intValue=Integer.parseInt(hexString.substring(x,x + 2),16);
        myByte[x / 2]=(byte)intValue;
      }
      return myByte;
    }
}
