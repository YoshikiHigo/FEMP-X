package all;

public class ClonePair12081 {

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

    String method2(String source,String pattern,String replace){
      if (source != null) {
        int len=pattern.length();
        StringBuffer sb=new StringBuffer();
        int found=-1;
        int start=0;
        while ((found=source.indexOf(pattern,start)) != -1) {
          sb.append(source.substring(start,found));
          sb.append(replace);
          start=found + len;
        }
        sb.append(source.substring(start));
        return sb.toString();
      }
     else   return null;
    }
}
