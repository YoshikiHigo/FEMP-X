package unverified;

public class ClonePair11712 {

    String method1(String initialString,String toReplace,String replacement){
      if (initialString == null) {
        return null;
      }
      if (toReplace != null && !(toReplace.equals("")) && replacement != null) {
        StringBuffer stb=new StringBuffer();
        int index=initialString.indexOf(toReplace);
        int oldIndex=0;
        while (index != -1) {
          stb.append(initialString.substring(oldIndex,index));
          stb.append(replacement);
          oldIndex=index + toReplace.length();
          index=initialString.indexOf(toReplace,index + toReplace.length());
        }
        stb.append(initialString.substring(oldIndex));
        return stb.toString();
      }
     else {
        return initialString;
      }
    }

    String method2(String str,String from,String to){
      int lenFrom;
      if (str == null) {
        return null;
      }
     else   if (from == null || (lenFrom=from.length()) == 0 || to == null) {
        return str;
      }
      StringBuffer buf=new StringBuffer(str);
      int lenTo=to.length();
      int pos=buf.indexOf(from);
      while (pos >= 0) {
        buf.replace(pos,pos + lenFrom,to);
        pos=buf.indexOf(from,pos + lenTo);
      }
      return buf.toString();
    }
}
