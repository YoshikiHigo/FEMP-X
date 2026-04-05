package unverified;

public class ClonePair12425 {

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

    String method2(String aString,String source,String target){
      if (aString == null) {
        return null;
      }
      String normalString="";
      int length=aString.length();
      int position=0;
      int previous=0;
      int spacer=source.length();
      while (position + spacer - 1 < length && aString.indexOf(source,position) > -1) {
        position=aString.indexOf(source,previous);
        normalString=normalString + aString.substring(previous,position) + target;
        position+=spacer;
        previous=position;
      }
      normalString=normalString + aString.substring(position,aString.length());
      return normalString;
    }
}
