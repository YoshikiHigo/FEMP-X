package unverified;

public class ClonePair10575 {

    String method1(String s,String o,String n){
      if (s == null)   return null;
      int begin=s.indexOf(o);
      if (begin == -1)   return s;
      int end=begin + o.length();
      return (new StringBuffer(s)).replace(begin,end,n).toString();
    }

    String method2(String template,String placeholder,String replacement){
      int loc=template == null ? -1 : template.indexOf(placeholder);
      if (loc < 0) {
        return template;
      }
     else {
        return new StringBuffer(template.substring(0,loc)).append(replacement).append(template.substring(loc + placeholder.length())).toString();
      }
    }
}
