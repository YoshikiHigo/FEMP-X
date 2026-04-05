package unverified;

public class ClonePair11180 {

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
