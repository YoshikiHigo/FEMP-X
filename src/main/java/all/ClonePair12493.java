package all;

public class ClonePair12493 {

    String method1(String string,String oldPattern,String newPattern){
      if (string == null)   return string;
      int oldIndex=string.indexOf(oldPattern);
      if (oldIndex < 0)   return string;
      StringBuffer returnVal=new StringBuffer();
      int start=0;
      do {
        returnVal.append(string.substring(start,oldIndex));
        returnVal.append(newPattern);
        start=oldIndex + oldPattern.length();
        oldIndex=string.indexOf(oldPattern,start);
      }
     while (oldIndex > 0);
      returnVal.append(string.substring(start));
      return returnVal.toString();
    }

    String method2(String source,String find,String replace){
      if (source == null)   return null;
      StringBuffer sb=null;
      int pos;
      do {
        if ((pos=source.indexOf(find)) < 0)     break;
        if (sb == null)     sb=new StringBuffer();
        if (pos > 0)     sb.append(source.substring(0,pos));
        sb.append(replace);
        source=source.substring(pos + find.length());
      }
     while (source.length() > 0);
      if (sb == null)   return source;
     else {
        sb.append(source);
        return sb.toString();
      }
    }
}
