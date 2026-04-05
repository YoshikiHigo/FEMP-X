package all;

public class ClonePair12131 {

    String method1(String originalString,String stringToReplace,String stringToIntroduce){
      if (originalString.indexOf(stringToReplace) < 0) {
        return originalString;
      }
     else {
        StringBuffer buf=new StringBuffer();
        int startIndex=0;
        int endIndex=originalString.indexOf(stringToReplace);
        do {
          String addString=originalString.substring(startIndex,endIndex);
          buf.append(addString);
          if (endIndex != 0 && endIndex < originalString.length()) {
            buf.append(stringToIntroduce);
          }
          startIndex=endIndex + stringToReplace.length();
          endIndex=originalString.indexOf(stringToReplace,startIndex);
          if (endIndex == -1) {
            endIndex=originalString.length();
          }
        }
     while (startIndex <= originalString.length());
        return buf.toString();
      }
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
