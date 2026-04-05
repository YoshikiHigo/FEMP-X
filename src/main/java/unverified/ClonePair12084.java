package unverified;

public class ClonePair12084 {

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

    String method2(String subject,String find,String replace){
      if (subject == null)   return null;
      StringBuffer buf=new StringBuffer();
      int l=find.length();
      int s=0;
      int i=subject.indexOf(find);
      while (i != -1) {
        buf.append(subject.substring(s,i));
        buf.append(replace);
        s=i + l;
        i=subject.indexOf(find,s);
      }
      buf.append(subject.substring(s));
      return buf.toString();
    }
}
