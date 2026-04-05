package all;

public class ClonePair12424 {

    String method1(String p_Value,String p_SearchString,String p_ReplaceString){
      if (p_Value == null)   return null;
      StringBuffer buf=new StringBuffer(p_Value.length());
      int len=p_SearchString.length();
      int off=0;
      int index=0;
      if ((index=p_Value.indexOf(p_SearchString,off)) >= 0) {
        buf.append(p_Value.substring(off,index));
        buf.append(p_ReplaceString);
        off=index + len;
      }
      buf.append(p_Value.substring(off));
      return buf.toString();
    }

    String method2(String sourceString,String toReplaceString,String replaceString){
      String returnString=sourceString;
      int stringLength=0;
      if (toReplaceString != null) {
        stringLength=toReplaceString.length();
      }
      if (returnString != null && returnString.length() > stringLength) {
        int max=0;
        String S4="";
        for (int i=0; i < sourceString.length(); i++) {
          max=i + toReplaceString.length() > sourceString.length() ? sourceString.length() : i + stringLength;
          String S3=sourceString.substring(i,max);
          if (!S3.equals(toReplaceString)) {
            S4+=S3.substring(0,1);
          }
     else {
            S4+=replaceString;
            i+=stringLength - 1;
          }
        }
        returnString=S4;
      }
      return returnString;
    }
}
