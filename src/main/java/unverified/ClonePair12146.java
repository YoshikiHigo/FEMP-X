package unverified;

public class ClonePair12146 {

    String method1(String input,String replace,String replacement){
      if (replace.equals(replacement))   return input;
      int idx;
      if ((idx=input.indexOf(replace)) == -1) {
        return input;
      }
      boolean finished=false;
      while (!finished) {
        StringBuffer returning=new StringBuffer();
        while (idx != -1) {
          returning.append(input.substring(0,idx));
          returning.append(replacement);
          input=input.substring(idx + replace.length());
          idx=input.indexOf(replace);
        }
        returning.append(input);
        input=returning.toString();
        if ((idx=returning.indexOf(replace)) == -1) {
          finished=true;
        }
      }
      return input;
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
