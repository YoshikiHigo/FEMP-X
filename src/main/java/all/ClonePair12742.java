package all;

public class ClonePair12742 {

    String method1(String in,String match,String replacement){
      if (in == null || match == null || replacement == null) {
        return in;
      }
      StringBuffer out=new StringBuffer();
      int matchLength=match.length();
      int inLength=in.length();
      for (int i=0; i < inLength; i++) {
        int upperSearhLimit=i + matchLength;
        if ((upperSearhLimit <= inLength) && (in.substring(i,upperSearhLimit).equals(match))) {
          out.append(replacement);
          i=upperSearhLimit - 1;
        }
     else {
          out.append(in.charAt(i));
        }
      }
      return out.toString();
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
