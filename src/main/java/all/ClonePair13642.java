package all;

import java.util.StringTokenizer;

public class ClonePair13642 {

    byte[] method1(String pInStr){
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

    byte[] method2(String s){
      String ts=s + "  ";
      int len=0;
      for (int i=0; i < s.length(); i++) {
        if (ts.charAt(i) != ' ') {
          if (ts.charAt(i + 1) != ' ') {
            i++;
            len++;
          }
     else {
            len++;
          }
        }
      }
      byte[] b=new byte[len];
      int saveAt=0;
      for (int i=0; i < s.length(); i++) {
        if (ts.charAt(i) != ' ') {
          if (ts.charAt(i + 1) != ' ') {
            String v="" + ts.charAt(i) + ts.charAt(i + 1);
            b[saveAt]=(byte)Integer.valueOf(v,16).intValue();
            i++;
            saveAt++;
          }
     else {
            String v="" + ts.charAt(i);
            b[saveAt]=(byte)Integer.valueOf(v,16).intValue();
            saveAt++;
          }
        }
      }
      return b;
    }
}
