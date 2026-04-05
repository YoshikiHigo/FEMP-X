package all;

import java.util.StringTokenizer;

public class ClonePair13444 {

    byte[] method1(String hexString){
      if ((hexString.length() & 1) == 1)   hexString='0' + hexString;
      byte[] tmp=new byte[hexString.length() / 2];
      for (int i=0; i < tmp.length; ++i) {
        String hexByte=hexString.substring(i * 2,i * 2 + 2);
        tmp[i]=(byte)Integer.parseInt(hexByte,16);
      }
      return tmp;
    }

    byte[] method2(String pInStr){
      int i=0;
      int j=0;
      byte[] tmpByteArr=new byte[pInStr.length()];
      StringTokenizer tokenizer=new StringTokenizer(pInStr);
      String strToken;
      while (tokenizer.hasMoreTokens()) {
        strToken=tokenizer.nextToken();
        j=0;
        while (j < strToken.length()) {
          tmpByteArr[i++]=(byte)Integer.parseInt(strToken.substring(j,j + 2 > strToken.length() ? strToken.length() : j + 2),16);
          j=j + 2;
        }
      }
      byte[] retByteArr=new byte[i];
      System.arraycopy(tmpByteArr,0,retByteArr,0,i);
      return retByteArr;
    }
}
