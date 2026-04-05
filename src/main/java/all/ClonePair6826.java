package all;

public class ClonePair6826 {

    boolean method1(String pattern,String key){
      if (key.length() < pattern.length())   return false;
      for (int i=0; i < pattern.length(); i++) {
        char format=pattern.charAt(i);
        char ch=key.charAt(i);
        if (!((format == '#' && Character.isDigit(ch)) || (format == ch))) {
          return false;
        }
      }
      return true;
    }

    boolean method2(String s,String pattern){
      String line=s.toLowerCase(), temp;
      String patt=pattern.toLowerCase();
      int pc=0, lc=0;
      while (patt.length() > 0 && line.length() > 0) {
        if (patt.charAt(0) == '*') {
          patt=patt.substring(1);
          if (patt.length() == 0) {
            line="";
            break;
          }
     else {
            pc=patt.indexOf("*");
            if (pc == -1)         pc=patt.length();
            temp=patt.substring(0,pc);
            lc=line.indexOf(temp);
            if (lc == -1)         break;
            patt=patt.substring(pc);
            line=line.substring(lc + temp.length());
          }
        }
     else     if (patt.charAt(0) == line.charAt(0)) {
          patt=patt.substring(1);
          line=line.substring(1);
        }
     else     break;
      }
      while (patt.startsWith("*"))   patt=patt.substring(1);
      if (patt.length() == 0 && line.length() == 0)   return true;
     else   return false;
    }
}
