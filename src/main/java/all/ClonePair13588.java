package all;

public class ClonePair13588 {

    String method1(String a_source,String a_toReplace,String a_replaceWith){
      int position;
      while ((position=a_source.indexOf(a_toReplace)) != -1) {
        int position2=a_source.indexOf(a_replaceWith);
        if (a_replaceWith.indexOf(a_toReplace) != -1) {
          position2+=a_replaceWith.indexOf(a_toReplace);
        }
        if (position == position2) {
          break;
        }
        String before=a_source.substring(0,position);
        String after=a_source.substring(position + a_toReplace.length(),a_source.length());
        a_source=before + a_replaceWith + after;
      }
      return a_source;
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
