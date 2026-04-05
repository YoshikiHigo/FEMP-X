package unverified;

public class ClonePair13073 {

    String method1(String str,String find,String replace){
      int strlen, findlen;
      char[] chars, replaceChars;
      if (str == null || ((strlen=(chars=str.toCharArray()).length) < (findlen=find.length()))) {
        return str;
      }
      replaceChars=replace.toCharArray();
      final StringBuilder sb=new StringBuilder(strlen);
      int sCut=0;
      for (int eCut; (eCut=str.indexOf(find,sCut)) != -1; sCut=eCut + findlen) {
        sb.append(chars,sCut,(eCut - sCut)).append(replaceChars);
      }
      return sCut > 0 ? sb.append(chars,sCut,(strlen - sCut)).toString() : str;
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
