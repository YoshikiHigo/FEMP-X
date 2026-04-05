package unverified;

import java.util.StringTokenizer;

public class ClonePair4045 {

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

    boolean method2(String arg1,String arg2){
      if (arg1.length() > arg2.length())   return false;
      boolean returnArg=true;
      int i=0;
      int length=arg1.length();
      while (i < length) {
        char x=arg1.charAt(i);
        char y=arg2.charAt(i);
        if (x != y) {
          returnArg=false;
          break;
        }
        i+=1;
      }
      if (arg2.length() > length) {
        if (arg2.charAt(i) != '.')     returnArg=false;
      }
      return returnArg;
    }
}
