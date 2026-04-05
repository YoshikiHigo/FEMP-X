package all;

public class ClonePair10303 {

    String method1(String str,String s1,String s2){
      if (str.equals(s1))   return s2;
     else   if (!str.endsWith(s1))   return str;
      int pos=str.lastIndexOf(s1);
      if (pos < 0)   return str;
      return str.substring(0,str.length() - s1.length()) + s2;
    }

    String method2(String sInString,String sReplaceWhat,String sReplaceWith){
      int iIndex=0;
      while ((iIndex=sInString.indexOf(sReplaceWhat)) != -1) {
        String sPrefix="";
        if (iIndex != 0)     sPrefix=sInString.substring(0,iIndex);
        String sPostfix="";
        if (iIndex + sReplaceWhat.length() < sInString.length())     sPostfix=sInString.substring(iIndex + sReplaceWhat.length(),sInString.length());
        sInString=sPrefix + sReplaceWith + sPostfix;
      }
      return sInString;
    }
}
