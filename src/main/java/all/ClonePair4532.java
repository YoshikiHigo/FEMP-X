package all;

public class ClonePair4532 {

    boolean method1(String name,String template){
      int wildcardIdx=template.indexOf("*");
      if (wildcardIdx == -1)   return name.equals(template);
      boolean isBeginning=true;
      String beforeWildcard="";
      String afterWildcard=template;
      while (wildcardIdx != -1) {
        beforeWildcard=afterWildcard.substring(0,wildcardIdx);
        afterWildcard=afterWildcard.substring(wildcardIdx + 1);
        int beforeStartIdx=name.indexOf(beforeWildcard);
        if ((beforeStartIdx == -1) || (isBeginning && beforeStartIdx != 0)) {
          return false;
        }
        isBeginning=false;
        name=name.substring(beforeStartIdx + beforeWildcard.length());
        wildcardIdx=afterWildcard.indexOf("*");
      }
      return name.endsWith(afterWildcard);
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
