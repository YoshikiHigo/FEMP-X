package unverified;

import java.util.StringTokenizer;

public class ClonePair4016 {

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

    boolean method2(String pattern,String key){
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
}
