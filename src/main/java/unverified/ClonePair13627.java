package unverified;

public class ClonePair13627 {

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

    byte[] method2(String str){
      char[] chars=str.toCharArray();
      int chars_length=chars.length - chars.length % 2;
      byte[] res=new byte[chars_length / 2];
      for (int i=0; i < chars_length; i+=2) {
        String b=new String(chars,i,2);
        res[i / 2]=(byte)Integer.parseInt(b,16);
      }
      return (res);
    }
}
