package unverified;

public class ClonePair12613 {

    String method1(String s,char c){
      if (s == null || s.length() == 0)   return s;
      int spos=0;
      while (true) {
        if (s.charAt(spos) == c)     spos++;
     else     break;
        if (spos >= s.length() - 1)     break;
      }
      int epos=s.length() - 1;
      while (true) {
        if (s.charAt(epos) == c)     epos--;
     else     break;
        if (epos <= 0)     break;
      }
      if (spos <= epos && (epos < s.length())) {
        return (s.substring(spos,epos + 1));
      }
      if (spos + 1 + epos == s.length())   return "";
      return s;
    }

    String method2(String str,char c){
      if (str == null) {
        return null;
      }
      int len=str.length();
      int st=0;
      while ((st < len) && (str.charAt(st) == c)) {
        st++;
      }
      while ((len > st) && (str.charAt(len - 1) == c)) {
        len--;
      }
      return ((st > 0) || (len < str.length())) ? str.substring(st,len) : str;
    }
}
