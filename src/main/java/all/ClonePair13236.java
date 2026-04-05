package all;

public class ClonePair13236 {

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

    byte[] method2(String value){
      byte[] data=new byte[value.length() / 2];
      for (int i=0; i < value.length(); i+=2) {
        String s="0x" + value.substring(i,i + 2);
        data[i / 2]=(byte)(0x000000FF & Integer.decode(s));
      }
      return data;
    }
}
