package unverified;

public class ClonePair11889 {

    String method1(String source,String findToken,String replaceToken){
      if (source == null) {
        return null;
      }
      StringBuilder sb=null;
      int pos;
      do {
        if ((pos=source.indexOf(findToken)) < 0) {
          break;
        }
        if (sb == null) {
          sb=new StringBuilder();
        }
        if (pos > 0) {
          sb.append(source.substring(0,pos));
        }
        sb.append(replaceToken);
        source=source.substring(pos + findToken.length());
      }
     while (source.length() > 0);
      if (sb == null) {
        return source;
      }
     else {
        sb.append(source);
        return sb.toString();
      }
    }

    String method2(String orig,String src,String dest){
      if (orig == null)   return null;
      StringBuffer res=new StringBuffer();
      int start, end=0, last=0;
      while ((start=orig.indexOf(src,end)) != -1) {
        res.append(orig.substring(last,start));
        res.append(dest);
        end=start + src.length();
        last=start + src.length();
      }
      res.append(orig.substring(end));
      return res.toString();
    }
}
