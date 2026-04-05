package unverified;

public class ClonePair12342 {

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

    boolean method2(String url){
      for (int i=0; i < url.length(); i++) {
        char c=url.charAt(i);
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')|| (c == '-')) {
          continue;
        }
        return false;
      }
      return true;
    }
}
