package unverified;

public class ClonePair6266 {

    boolean method1(String item,String part){
      int i0=part.indexOf('*');
      int i1=part.lastIndexOf('*');
      if ((i0 == -1) && (i1 == -1))   return item.equals(part);
     else   if (i0 == i1)   return item.startsWith(part.substring(0,i0)) && item.endsWith(part.substring(i0 + 1));
     else   if ((i0 == 0) && (i1 == (part.length() - 1)))   return item.contains(part.substring(i0 + 1,i1));
     else   return item.startsWith(part.substring(0,i0)) && item.endsWith(part.substring(i0 + 1)) && item.contains(part.substring(i0 + 1,i1));
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
