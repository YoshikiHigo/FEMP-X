package all;

public class ClonePair10699 {

    String method1(String s,String placeholder,String value){
      if (s == null)   return "";
      if (s.length() == 0)   return s;
      if (placeholder == null || placeholder.length() == 0)   return s;
      if (value == null)   value="";
      String result=s;
      int matchIndex=result.indexOf(placeholder);
      int plen=placeholder.length();
      while (matchIndex != -1) {
        result=result.substring(0,matchIndex) + value + result.substring(matchIndex + plen);
        matchIndex=result.indexOf(placeholder,matchIndex + plen);
      }
      return result;
    }

    String method2(String pSource,String pReplace,String pWith){
      if (pSource == null) {
        return "";
      }
      String strCompare=pSource;
      if (pSource == null || pReplace == null || pReplace.equals("") || pWith == null) {
        return pSource;
      }
      StringBuffer target=new StringBuffer();
      int indexSource=0;
      while (true) {
        int index=-1;
        int length=0;
        int tmpIndex=strCompare.indexOf(pReplace,indexSource);
        if (tmpIndex >= 0 && (index < 0 || index > tmpIndex)) {
          length=pReplace.length();
          index=tmpIndex;
        }
        if (index < 0) {
          target.append(pSource.substring(indexSource));
          return target.toString();
        }
        target.append(pSource.substring(indexSource,index));
        target.append(pWith);
        indexSource=index + length;
      }
    }
}
