package unverified;

public class ClonePair13460 {

    String method1(String s,String what,String onWhat){
      if (s == null) {
        return null;
      }
      String res;
      int i;
      i=s.lastIndexOf(what);
      if (i < 0) {
        return s;
      }
      res=s.substring(0,i) + onWhat + s.substring(i + what.length());
      return res;
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
