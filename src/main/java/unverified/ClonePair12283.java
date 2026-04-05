package unverified;

public class ClonePair12283 {

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

    @SuppressWarnings("unused") String method2(String strSource,String strFrom,String strTo){
      if (strSource == null) {
        return null;
      }
      int i=0;
      if ((i=strSource.indexOf(strFrom,i)) >= 0) {
        char[] cSrc=strSource.toCharArray();
        char[] cTo=strTo.toCharArray();
        int len=strFrom.length();
        StringBuffer buf=new StringBuffer(cSrc.length);
        buf.append(cSrc,0,i).append(cTo);
        i+=len;
        int j=i;
        while ((i=strSource.indexOf(strFrom,i)) > 0) {
          buf.append(cSrc,j,i - j).append(cTo);
          i+=len;
          j=i;
        }
        buf.append(cSrc,j,cSrc.length - j);
        return buf.toString();
      }
      return strSource;
    }
}
