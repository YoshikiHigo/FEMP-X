package all;

public class ClonePair12366 {

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

    String method2(String source,String toReplace,String replacement){
      if (source != null && source.indexOf(toReplace) != -1) {
        StringBuffer sb=new StringBuffer();
        int ix=-1;
        while ((ix=source.indexOf(toReplace)) >= 0) {
          sb.append(source.substring(0,ix)).append(replacement);
          source=source.substring(ix + toReplace.length());
        }
        if (source.length() >= 1) {
          sb.append(source);
        }
        return sb.toString();
      }
      return source;
    }
}
