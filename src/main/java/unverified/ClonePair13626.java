package unverified;

public class ClonePair13626 {

    byte[] method1(String s){
      byte[] bytes;
      bytes=new byte[s.length() / 2];
      int iPos=0;
      int i=0;
      for (; iPos < s.length(); ) {
        while (iPos < s.length() && (s.charAt(iPos) == ' ' || s.charAt(iPos) == ':')) {
          iPos+=1;
        }
        if ((iPos + 2) <= s.length()) {
          bytes[i]=(byte)Integer.parseInt(s.substring(iPos,iPos + 2),16);
          i++;
          iPos+=2;
        }
      }
      byte trimmed[]=new byte[i];
      for (int iCopy=0; iCopy < i; iCopy++) {
        trimmed[iCopy]=bytes[iCopy];
      }
      return trimmed;
    }

    byte[] method2(String device){
      int len=device.length() / 2;
      byte[] data=new byte[len];
      for (int i=len - 1; i >= 0; i--) {
        data[i]=(byte)Integer.parseInt(device.substring(i * 2,i * 2 + 2),16);
      }
      return data;
    }
}
