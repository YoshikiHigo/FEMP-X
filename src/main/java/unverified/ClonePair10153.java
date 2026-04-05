package unverified;

public class ClonePair10153 {

    String method1(String str,String find,String replace){
      if (str == null)   return null;
      if ((find == null) || (find.length() == 0))   return str;
      if (replace == null)   replace="";
      StringBuffer sb=new StringBuffer(str.length());
      int pos=0;
      int lastPos=0;
      while (pos >= 0) {
        pos=str.indexOf(find,lastPos);
        if (pos >= 0) {
          sb.append(str.substring(lastPos,pos));
          sb.append(replace);
        }
     else {
          sb.append(str.substring(lastPos));
        }
        lastPos=pos + find.length();
      }
      return sb.toString();
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
