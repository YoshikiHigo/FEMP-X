package unverified;

public class ClonePair13260 {

    byte[] method1(String txt){
      int i=0;
      int v=0;
      byte[] value=null;
      txt=txt.trim();
      if (txt.equals("") || (txt == null)) {
        value=new byte[0];
      }
     else {
        while ((i=txt.indexOf(" ")) >= 0) {
          txt=txt.substring(0,i) + txt.substring(i + 1,txt.length());
        }
        value=new byte[txt.length() / 2];
        for (i=0; i < txt.length() / 2; i++) {
          v=Integer.parseInt(txt.substring(i * 2,i * 2 + 2),16);
          value[i]=(byte)(v % 0x100);
        }
      }
      return value;
    }

    byte[] method2(String s){
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
}
