package all;

import java.util.StringTokenizer;

public class ClonePair4026 {

    boolean method1(String src,String mask){
      boolean res=true;
      int pos=0;
      boolean first=true;
      if (mask.indexOf('*') >= 0) {
        StringTokenizer st=new StringTokenizer(mask,"*");
        while (st.hasMoreTokens()) {
          String m=st.nextToken();
          int mlen=m.length();
          if (mlen > 0) {
            if ((pos + mlen) < src.length()) {
              int npos=src.indexOf(m,pos);
              if (npos >= 0) {
                if (first && mask.charAt(0) != '*') {
                  if (npos != 0) {
                    npos=-1;
                  }
                }
     else             if (!st.hasMoreTokens() && mask.charAt(mask.length() - 1) != '*') {
                  if ((npos + mlen) < src.length()) {
                    npos=-1;
                  }
                }
              }
              if (npos >= 0) {
                pos=npos + mlen;
              }
     else {
                res=false;
                pos=src.length();
              }
            }
     else {
              res=false;
              pos=src.length();
            }
          }
          first=false;
        }
      }
     else {
        res=src.compareTo(mask) == 0;
      }
      return res;
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
