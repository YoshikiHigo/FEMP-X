package all;

public class ClonePair11856 {

    String method1(String szSrc,String szOld,String szNew){
      try {
        if (szSrc == null || szSrc.trim().equals("")) {
          return "";
        }
        StringBuffer sb=new StringBuffer();
        String szTmp=szSrc.trim();
        if (szOld == null || szOld.equals("")) {
          return szTmp;
        }
        if (szNew == null) {
          return szTmp;
        }
        int iOldLen=szOld.length();
        int iNewLen=szNew.length();
        int iSrcLen=szSrc.length();
        int iPos=-1;
        int iStart=0;
        while ((iPos=szTmp.indexOf(szOld,iStart)) > -1) {
          sb.append(szTmp.substring(iStart,iPos));
          sb.append(szNew);
          iStart=iPos + iOldLen;
        }
        if (iStart < iSrcLen) {
          sb.append(szTmp.substring(iStart));
        }
        return sb.toString();
      }
     catch (  Exception ex) {
        return "";
      }
    }

    String method2(String source,String src,String dest){
      if (source == null || "".equals(source)) {
        return "";
      }
      if (src == null || "".equals(src)) {
        return source;
      }
      String ret="";
      if (source.indexOf(src) != -1) {
        while (source.indexOf(src) != -1) {
          ret+=source.substring(0,source.indexOf(src));
          ret+=dest;
          source=source.substring(source.indexOf(src) + src.length(),source.length());
        }
        ret+=source;
      }
     else {
        ret=source;
      }
      return ret;
    }
}
