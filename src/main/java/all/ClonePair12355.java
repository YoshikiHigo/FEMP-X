package all;

public class ClonePair12355 {

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

    boolean method2(String name){
      if (name.length() > 16) {
        return false;
      }
     else {
        for (int iChar=0; iChar < name.length(); iChar++) {
          char c=name.charAt(iChar);
          if ((!Character.isDigit(c)) && (!Character.isLetter(c)) && (c != '_')&& (c != '-')) {
            return false;
          }
        }
      }
      return true;
    }
}
