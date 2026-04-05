package all;

public class ClonePair11910 {

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

    String method2(String source,String toReplace,String replacement){
      if (source != null && source.indexOf(toReplace) != -1) {
        StringBuffer sb=new StringBuffer();
        int ix=-1;
        if ((ix=source.lastIndexOf(toReplace)) >= 0) {
          sb.append(source.substring(0,ix)).append(replacement);
          source=source.substring(ix + toReplace.length());
        }
        if (source.length() >= 1) {
          sb.append(source);
        }
        return sb.toString();
      }
      return source;
    }
}
