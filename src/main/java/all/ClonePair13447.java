package all;

public class ClonePair13447 {

    byte[] method1(String rendered){
      byte[] result=new byte[rendered.length() / 2];
      for (int byteIndex=0; byteIndex < result.length; byteIndex++) {
        String byteStr=rendered.substring(byteIndex * 2,byteIndex * 2 + 2);
        int byteAsSignedInt=Integer.parseInt(byteStr,16);
        if (0X7f < byteAsSignedInt) {
          result[byteIndex]=(byte)byteAsSignedInt;
        }
     else {
          result[byteIndex]=(byte)(-0x100 + byteAsSignedInt);
        }
      }
      return result;
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
