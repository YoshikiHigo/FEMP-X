package all;

public class ClonePair12371 {

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
