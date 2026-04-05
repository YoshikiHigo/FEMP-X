package unverified;

public class ClonePair13445 {

    byte[] method1(String hexString){
      if ((hexString.length() & 1) == 1)   hexString='0' + hexString;
      byte[] tmp=new byte[hexString.length() / 2];
      for (int i=0; i < tmp.length; ++i) {
        String hexByte=hexString.substring(i * 2,i * 2 + 2);
        tmp[i]=(byte)Integer.parseInt(hexByte,16);
      }
      return tmp;
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
