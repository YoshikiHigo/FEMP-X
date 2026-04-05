package all;

public class ClonePair12272 {

    String method1(String strOrig,String strFind,String strReplace){
      if (strOrig == null) {
        return null;
      }
      StringBuffer sb=new StringBuffer(strOrig);
      String toReplace="";
      if (strReplace == null)   toReplace="";
     else   toReplace=strReplace;
      int pos=strOrig.length();
      while (pos > -1) {
        pos=strOrig.lastIndexOf(strFind,pos);
        if (pos > -1)     sb.replace(pos,pos + strFind.length(),toReplace);
        pos=pos - strFind.length();
      }
      return sb.toString();
    }

    String method2(String source,String search,String replace){
      if (search.equals(replace)) {
        return source;
      }
      StringBuffer result=new StringBuffer();
      int len=search.length();
      if (len == 0) {
        return source;
      }
      int pos=0;
      int nPos;
      do {
        nPos=source.indexOf(search,pos);
        if (nPos != -1) {
          result.append(source.substring(pos,nPos));
          result.append(replace);
          pos=nPos + len;
        }
     else {
          result.append(source.substring(pos));
        }
      }
     while (nPos != -1);
      return result.toString();
    }
}
