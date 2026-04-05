package unverified;

public class ClonePair9900 {

    String method1(String input,String search,String replace){
      if (input == null || search == null) {
        return input;
      }
      if (replace == null) {
        replace="";
      }
      int index=input.indexOf(search);
      if (index == -1) {
        return input;
      }
      StringBuffer out=new StringBuffer();
      int afterPrev=0;
      while (index != -1) {
        out.append(input.substring(afterPrev,index));
        out.append(replace);
        afterPrev=index + search.length();
        index=input.indexOf(search,afterPrev);
      }
      out.append(input.substring(afterPrev));
      return out.toString();
    }

    String method2(String sTarget,String sSubstring,String sReplaceWith){
      if ((sTarget != null) && (sSubstring != null)) {
        if (sReplaceWith == null) {
          sReplaceWith="";
        }
        int len=sTarget.length();
        int searchlen=sSubstring.length();
        int replacelen=sReplaceWith.length();
        StringBuffer result=null;
        int pos=0;
        int lastPos=0;
        while ((pos=sTarget.indexOf(sSubstring,lastPos)) > -1) {
          if (result == null) {
            result=new StringBuffer(len);
          }
          result.append(sTarget.substring(lastPos,pos));
          if (replacelen > 0) {
            result.append(sReplaceWith);
          }
          lastPos=pos + searchlen;
        }
        if (result != null) {
          if (lastPos < len) {
            result.append(sTarget.substring(lastPos));
          }
          return result.toString();
        }
      }
      return sTarget;
    }
}
