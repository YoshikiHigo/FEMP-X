package unverified;

public class ClonePair3778 {

    boolean method1(String prefix,String string){
      int index1=0;
      int index2=0;
      int length1=prefix.length();
      int length2=string.length();
      char ch1=' ';
      char ch2=' ';
      while (index1 < length1 && index2 < length2) {
        while (index1 < length1 && Character.isWhitespace(ch1=prefix.charAt(index1))) {
          index1++;
        }
        while (index2 < length2 && Character.isWhitespace(ch2=string.charAt(index2))) {
          index2++;
        }
        if (index1 == length1 && index2 == length2) {
          return true;
        }
        if (ch1 != ch2) {
          return false;
        }
        index1++;
        index2++;
      }
      if (index1 < length1 && index2 >= length2)   return false;
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
