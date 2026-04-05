package unverified;

public class ClonePair13405 {

    String method1(String string,String leading,String trailing){
      int i_start=string.indexOf(leading);
      if (i_start < 0) {
        return null;
      }
      i_start+=leading.length();
      int i_end=string.indexOf(trailing,i_start);
      if (i_end < 0) {
        return null;
      }
      return string.substring(i_start,i_end);
    }

    String method2(String text,String start,String end){
      int i=0;
      int j=0;
      if ((i=text.indexOf(start)) > -1 && (j=text.indexOf(end,i + start.length())) > -1) {
        return text.substring(i + start.length(),j);
      }
      return null;
    }
}
