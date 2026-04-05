package unverified;

public class ClonePair11884 {

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

    String method2(String original,String replace,String with){
      if (original == null) {
        return original;
      }
      final int len=replace.length();
      StringBuffer sb=new StringBuffer(original.length());
      int start=0;
      int found=-1;
      while ((found=original.indexOf(replace,start)) != -1) {
        sb.append(original.substring(start,found));
        sb.append(with);
        start=found + len;
      }
      sb.append(original.substring(start));
      return sb.toString();
    }
}
