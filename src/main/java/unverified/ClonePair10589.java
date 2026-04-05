package unverified;

public class ClonePair10589 {

    String method1(String s,String o,String n){
      if (s == null)   return null;
      int begin=s.indexOf(o);
      if (begin == -1)   return s;
      int end=begin + o.length();
      return (new StringBuffer(s)).replace(begin,end,n).toString();
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
