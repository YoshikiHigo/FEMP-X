package all;

public class ClonePair13629 {

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

    byte[] method2(String s){
      byte[] bb=new byte[s.length() / 2];
      int ii;
      for (int i=0; i < bb.length; i++) {
        ii=Integer.parseInt(s.substring(i * 2,i * 2 + 2),16);
        if (ii > 127) {
          ii=ii - 256;
        }
        bb[i]=(byte)ii;
      }
      return bb;
    }
}
