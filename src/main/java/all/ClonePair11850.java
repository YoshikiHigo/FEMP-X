package all;

public class ClonePair11850 {

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

    String method2(String str,String oldCharset,String newCharset){
      if (str == null) {
        return "";
      }
      try {
        if (oldCharset != null && newCharset != null) {
          return new String(str.getBytes(oldCharset),newCharset);
        }
     else     if (oldCharset != null) {
          return new String(str.getBytes(oldCharset));
        }
     else     if (newCharset != null) {
          return new String(str.getBytes(),newCharset);
        }
      }
     catch (  Exception e) {
      }
      return str;
    }
}
