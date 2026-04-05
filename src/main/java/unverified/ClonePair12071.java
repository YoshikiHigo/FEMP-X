package unverified;

public class ClonePair12071 {

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

    String method2(String original,String replace,String with){
      if (original == null) {
        return original;
      }
      final int len=replace.length();
      StringBuffer sb=new StringBuffer(original.length());
      int start=0;
      int found=-1;
      while ((found=original.indexOf(replace,start)) != -1) {
        sb.append(original.substring(start,found));
        sb.append(with);
        start=found + len;
      }
      sb.append(original.substring(start));
      return sb.toString();
    }
}
