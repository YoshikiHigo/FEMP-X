package unverified;

public class ClonePair12319 {

    boolean method1(String text){
      char ch;
      text=text.toUpperCase();
      boolean retVal=true;
      for (int i=0; i < text.length(); i++) {
        ch=text.charAt(i);
        if (!((ch >= 'A' && ch <= 'Z') || (ch == ' ' || ch == '.' || ch == ',')))     retVal=false;
      }
      return retVal;
    }

    boolean method2(String s){
      final char[] chars=s.toCharArray();
      for (int x=0; x < chars.length; x++) {
        final char c=chars[x];
        if ((c >= 'a') && (c <= 'z'))     continue;
        if ((c >= 'A') && (c <= 'Z'))     continue;
        if ((x >= 1) && (c >= '0') && (c <= '9'))     continue;
        if ((x >= 1) && (c == '_'))     continue;
        if ((x >= 1) && (c == '-'))     continue;
        return false;
      }
      return true;
    }
}
