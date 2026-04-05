package unverified;

public class ClonePair12365 {

    String method1(String string,String placeholder,String replacement){
      if (string == null) {
        return string;
      }
      int loc=string.indexOf(placeholder);
      if (loc < 0) {
        return string;
      }
     else {
        return new StringBuilder(string.substring(0,loc)).append(replacement).append(string.substring(loc + placeholder.length())).toString();
      }
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
