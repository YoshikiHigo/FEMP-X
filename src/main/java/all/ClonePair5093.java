package all;

public class ClonePair5093 {

    boolean method1(String identifier,String validCharSet){
      int len=identifier.length();
      for (int i=0; i < len; i++) {
        int ch=identifier.charAt(i);
        boolean isValidChar=('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z') || ('0' <= ch && ch <= '9');
        if (!isValidChar && (validCharSet != null)) {
          isValidChar=(validCharSet.indexOf(ch) != -1);
        }
        if (!isValidChar)     return false;
      }
      return true;
    }

    boolean method2(String i1,String i2){
      if (i1.length() != 0 && !i1.equals("none") && !i1.equals(i2))   return false;
      return true;
    }
}
