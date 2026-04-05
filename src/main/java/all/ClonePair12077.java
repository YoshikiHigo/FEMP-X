package all;

public class ClonePair12077 {

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
