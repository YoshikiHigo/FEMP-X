package all;

public class ClonePair12414 {

    String method1(String str,String oldCharset,String newCharset){
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

    String method2(String szSrc,String szOld,String szNew){
      try {
        int iPos=-1;
        if (szSrc == null || szSrc.trim().equals("")) {
          return "";
        }
        StringBuffer sb=new StringBuffer();
        String szTmp=szSrc.trim();
        if (szNew == null) {
          return szTmp;
        }
        if (szOld == null || szOld.equals("")) {
          return szTmp;
        }
        if ((iPos=szTmp.toLowerCase().indexOf(szOld.toLowerCase())) == -1) {
          return szTmp;
        }
        if (";font;color;red;color_kw;".indexOf(szOld.toLowerCase()) > -1) {
          return szTmp;
        }
        int iOldLen=szOld.length();
        int iSrcLen=szSrc.length();
        int iStart=0;
        while ((iPos=szTmp.toLowerCase().indexOf(szOld.toLowerCase(),iStart)) > -1) {
          sb.append(szTmp.substring(iStart,iPos));
          String strTemp=sb.toString().toLowerCase();
          int loc1=strTemp.lastIndexOf("<");
          int loc2=strTemp.lastIndexOf(">");
          if ((loc1 > loc2) && ((szOld.toLowerCase()).indexOf("my_color_key_word") < 0)) {
            sb.append(szOld);
          }
     else       if (iPos == szTmp.toLowerCase().indexOf("javascript:",iStart)) {
            sb.append(szOld);
          }
     else {
            sb.append(szNew);
          }
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
}
