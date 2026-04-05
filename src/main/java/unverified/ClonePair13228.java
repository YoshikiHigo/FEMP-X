package unverified;

public class ClonePair13228 {

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
      int length=hexString.length();
      byte[] data=new byte[length / 2];
      for (int i=0; i < length; i+=2) {
        data[i / 2]=(byte)Integer.parseInt(hexString.substring(i,i + 2),16);
      }
      return data;
    }
}
