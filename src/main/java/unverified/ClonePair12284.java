package unverified;

public class ClonePair12284 {

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
