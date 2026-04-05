package unverified;

public class ClonePair8573 {

    String method1(String base,String what){
      if (base != null && base.endsWith(what)) {
        base=base.substring(0,base.length() - what.length());
      }
      return base;
    }

    String method2(String strName,String strDelimiter){
      if (strName == null) {
        return strName;
      }
      if (!strName.startsWith(strDelimiter) || !strName.endsWith(strDelimiter)) {
        return strName;
      }
      int iDelimLength=strDelimiter.length();
      int iLength=strName.length() - iDelimLength;
      String strDoubledDelim=strDelimiter + strDelimiter;
      StringBuffer strbufTemp=new StringBuffer(strName.length());
      for (int iIndex=iDelimLength; iIndex < iLength; iIndex++) {
        if (strName.regionMatches(false,iIndex,strDoubledDelim,0,iDelimLength * 2)) {
          strbufTemp.append(strDelimiter);
          iIndex+=(iDelimLength * 2) - 1;
        }
     else {
          strbufTemp.append(strName.charAt(iIndex));
        }
      }
      return strbufTemp.toString();
    }
}
