package unverified;

public class ClonePair11516 {

    String method1(String inputString,String oldString,String newString){
      StringBuffer outputString=new StringBuffer(100);
      int startIndex=0, nextIndex;
      while (inputString.substring(startIndex).indexOf(oldString) > -1) {
        nextIndex=startIndex + inputString.substring(startIndex).indexOf(oldString);
        if (nextIndex > startIndex) {
          outputString.append(inputString.substring(startIndex,nextIndex));
        }
        outputString.append(newString);
        startIndex=nextIndex + oldString.length();
      }
      if (startIndex <= inputString.length() - 1) {
        outputString.append(inputString.substring(startIndex));
      }
      return outputString.toString();
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
