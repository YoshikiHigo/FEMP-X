package all;

public class ClonePair12022 {

    String method1(String input,String s1,String s2){
      boolean startsWith=input.startsWith(s1);
      boolean endsWith=input.endsWith(s2);
      if (!startsWith && !endsWith)   return input;
      int start=(startsWith) ? s1.length() : 0;
      int end=(endsWith) ? input.length() - s2.length() : input.length();
      return input.substring(start,end);
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
