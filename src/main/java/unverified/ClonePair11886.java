package unverified;

public class ClonePair11886 {

    String method1(String source,String findToken,String replaceToken){
      if (source == null) {
        return null;
      }
      StringBuilder sb=null;
      int pos;
      do {
        if ((pos=source.indexOf(findToken)) < 0) {
          break;
        }
        if (sb == null) {
          sb=new StringBuilder();
        }
        if (pos > 0) {
          sb.append(source.substring(0,pos));
        }
        sb.append(replaceToken);
        source=source.substring(pos + findToken.length());
      }
     while (source.length() > 0);
      if (sb == null) {
        return source;
      }
     else {
        sb.append(source);
        return sb.toString();
      }
    }

    String method2(String string,String oldString,String newString){
      if (string == null)   return null;
      if (newString == null)   return string;
      int i=0;
      if ((i=string.indexOf(oldString,i)) >= 0) {
        char string2[]=string.toCharArray();
        char newString2[]=newString.toCharArray();
        int oLength=oldString.length();
        StringBuffer buf=new StringBuffer(string2.length);
        buf.append(string2,0,i).append(newString2);
        i+=oLength;
        int j;
        for (j=i; (i=string.indexOf(oldString,i)) > 0; j=i) {
          buf.append(string2,j,i - j).append(newString2);
          i+=oLength;
        }
        buf.append(string2,j,string2.length - j);
        return buf.toString();
      }
     else {
        return string;
      }
    }
}
