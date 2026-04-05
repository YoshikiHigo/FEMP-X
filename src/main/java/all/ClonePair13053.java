package all;

public class ClonePair13053 {

    String method1(String s,String find,String replace){
      if (s == null)   return s;
      StringBuffer result=new StringBuffer();
      int index;
      while ((index=s.indexOf(find)) >= 0) {
        result.append(s.substring(0,index));
        result.append(replace);
        s=s.substring(index + find.length());
      }
      result.append(s);
      return result.toString();
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
