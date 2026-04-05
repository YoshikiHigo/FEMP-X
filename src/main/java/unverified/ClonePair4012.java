package unverified;

import java.util.StringTokenizer;

public class ClonePair4012 {

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

    boolean method2(String s,String prefix){
      final int pl=prefix.length();
      if (s.length() < pl)   return false;
      for (int i=0; i < pl; i++) {
        char sc=s.charAt(i);
        char pc=prefix.charAt(i);
        if (sc != pc) {
          sc=Character.toUpperCase(sc);
          pc=Character.toUpperCase(pc);
          if (sc != pc) {
            sc=Character.toLowerCase(sc);
            pc=Character.toLowerCase(pc);
            if (sc != pc)         return false;
          }
        }
      }
      return true;
    }
}
