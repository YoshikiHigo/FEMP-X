package unverified;

public class ClonePair12568 {

    String method1(String str,String thisStr,String withThisStr){
      if ((str == null) || (thisStr == null) || (withThisStr == null)|| (str.length() == 0)|| (thisStr.length() == 0))   return str;
      for (int i=str.length() - 1; i >= 0; i--) {
        if (str.charAt(i) == thisStr.charAt(0))     if (str.substring(i).startsWith(thisStr)) {
          str=str.substring(0,i) + withThisStr + str.substring(i + thisStr.length());
          return str;
        }
      }
      return str;
    }

    String method2(String s,String v1,String v2){
      if (s == null || v1 == null || v2 == null || v1.length() == 0 || v1.equals(v2)) {
        return s;
      }
      int ix=0;
      int v1Len=v1.length();
      int n=0;
      while (-1 != (ix=s.indexOf(v1,ix))) {
        n++;
        ix+=v1Len;
      }
      if (n == 0) {
        return s;
      }
      int start=0;
      int v2Len=v2.length();
      char[] r=new char[s.length() + n * (v2Len - v1Len)];
      int rPos=0;
      while (-1 != (ix=s.indexOf(v1,start))) {
        while (start < ix)     r[rPos++]=s.charAt(start++);
        for (int j=0; j < v2Len; j++) {
          r[rPos++]=v2.charAt(j);
        }
        start+=v1Len;
      }
      ix=s.length();
      while (start < ix)   r[rPos++]=s.charAt(start++);
      return new String(r);
    }
}
