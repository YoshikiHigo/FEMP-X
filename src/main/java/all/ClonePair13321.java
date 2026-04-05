package all;

public class ClonePair13321 {

    byte[] method1(String hexString){
      if ((hexString.length() % 2) == 1) {
        return null;
      }
      try {
        int idx=0;
        byte result[]=new byte[hexString.length() / 2];
        for (int i=0; i < hexString.length(); i+=2) {
          String val=hexString.substring(i,i + 2);
          int b=Integer.parseInt(val,16);
          result[idx++]=(byte)b;
        }
        return result;
      }
     catch (  Exception ex) {
        return null;
      }
    }

    byte[] method2(String hex){
      int len=hex.length();
      if (1 == (len & 1)) {
        return null;
      }
      byte[] result=new byte[len >> 1];
      int r=0;
      int pos=0;
      while (pos < len) {
        int nReg=0;
        for (int nI=0; nI < 2; nI++) {
          nReg<<=4;
          char c=Character.toLowerCase(hex.charAt(pos++));
          if ('0' <= c && '9' >= c) {
            nReg|=c - '0';
          }
     else       if ('a' <= c && 'f' >= c) {
            nReg|=(c - 'a') + 10;
          }
     else {
            return null;
          }
        }
        result[r++]=(byte)nReg;
      }
      return result;
    }
}
