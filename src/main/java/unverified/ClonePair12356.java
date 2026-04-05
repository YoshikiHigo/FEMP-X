package unverified;

public class ClonePair12356 {

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
      s=s.toLowerCase(java.util.Locale.ENGLISH);
      for (int i=0; i < s.length(); i++)   if ((s.charAt(i) < 'a') || (s.charAt(i) > 'z'))   return false;
      return true;
    }
}
