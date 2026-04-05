package unverified;

public class ClonePair12289 {

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
      final int length=s.length();
      for (int i=0; i < length; i++) {
        char c=s.charAt(i);
        if (!Character.isLetterOrDigit(c) && c != '.' && c != '-' && c != '_' && c != ':') {
          return false;
        }
      }
      return true;
    }
}
