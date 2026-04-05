package all;

public class ClonePair12457 {

    String method1(String toSearch,String find,String replace){
      if (find == null || toSearch == null || toSearch.indexOf(find) == -1)   return toSearch;
      if (replace == null)   replace="";
      int marker=0, findPos, findLen=find.length();
      StringBuilder sb=new StringBuilder();
      while ((findPos=toSearch.indexOf(find,marker)) > -1) {
        sb.append(toSearch.substring(marker,findPos));
        sb.append(replace);
        marker=findPos + findLen;
      }
      sb.append(toSearch.substring(marker));
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
