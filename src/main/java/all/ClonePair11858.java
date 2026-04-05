package all;

public class ClonePair11858 {

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
        if ((iPos=szTmp.indexOf(szOld)) == -1) {
          return szTmp;
        }
        int iOldLen=szOld.length();
        int iNewLen=szNew.length();
        int iSrcLen=szSrc.length();
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
}
