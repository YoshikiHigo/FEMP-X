package all;

public class ClonePair3924 {

    String method1(String text,String[] pattern,String[] replace){
      int startIndex;
      int foundIndex;
      StringBuffer result=new StringBuffer();
      for (int i=0; i < pattern.length; i++) {
        startIndex=0;
        result.setLength(0);
        while ((foundIndex=text.indexOf(pattern[i],startIndex)) >= 0) {
          result.append(text.substring(startIndex,foundIndex));
          result.append(replace[i]);
          startIndex=foundIndex + pattern[i].length();
        }
        result.append(text.substring(startIndex));
        text=result.toString();
      }
      return text;
    }

    String method2(String p_original,String[] p_old,String[] p_new){
      String x_latest=p_original;
      int x_start=0;
      StringBuffer x_buf=null;
      for (int i=0; i < p_old.length; i++) {
        while (x_start != -1) {
          x_start=x_latest.indexOf(p_old[i],x_start);
          if (x_start != -1) {
            x_buf=new StringBuffer(x_latest.length() + p_new[i].length());
            x_buf.append(x_latest);
            x_buf.replace(x_start,x_start + p_old[i].length(),p_new[i]);
            x_latest=x_buf.toString();
          }
        }
        x_start=0;
      }
      return x_latest;
    }
}
