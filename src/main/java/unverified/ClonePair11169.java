package unverified;

public class ClonePair11169 {

    String method1(String str,String from,String to){
      if (str == null)   return str;
      int index=str.indexOf(from);
      if (index == -1)   return str;
      int pos=0;
      final int fromLen=from.length();
      final StringBuilder sb=new StringBuilder();
      while (index > -1) {
        sb.append(str.substring(pos,index)).append(to);
        pos=index + fromLen;
        index=str.indexOf(from,pos);
      }
      sb.append(str.substring(pos));
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
