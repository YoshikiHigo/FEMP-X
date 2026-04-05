package unverified;

public class ClonePair12076 {

    String method1(String text,String replace,String with){
      if (text == null)   return null;
      int li=0;
      int l=replace.length();
      int i=text.indexOf(replace,li);
      if (i < 0)   return text;
      StringBuffer aWorkString=new StringBuffer(text.length() + 1);
      while (i >= 0) {
        if (i > li)     aWorkString.append(text.substring(li,i));
        aWorkString.append(with);
        li=i + l;
        i=text.indexOf(replace,li);
      }
      aWorkString.append(text.substring(li));
      return aWorkString.toString();
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
