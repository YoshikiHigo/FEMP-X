package all;

public class ClonePair13200 {

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

    byte[] method2(String hex){
      hex=hex.replaceAll(" ","");
      byte[] bytes=new byte[hex.length() / 2];
      for (int i=0; i < hex.length(); i+=2) {
        int num=Integer.parseInt(hex.substring(i,i + 2),16);
        bytes[i / 2]=(byte)num;
      }
      return bytes;
    }
}
