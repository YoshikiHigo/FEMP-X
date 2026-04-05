package all;

public class ClonePair12484 {

    String method1(String str,boolean trim){
      StringBuilder builder=new StringBuilder();
      char[] chars=str.toCharArray();
      Character previous=null;
      boolean gotChar=false;
      for (  char c : chars) {
        if (!Character.isWhitespace(c)) {
          if (((!gotChar && !trim) || gotChar) && previous != null && Character.isWhitespace(previous)) {
            builder.append(' ');
          }
          builder.append(c);
          gotChar=true;
        }
        previous=c;
      }
      if (gotChar && !trim && Character.isWhitespace(previous)) {
        builder.append(' ');
      }
      return builder.toString();
    }

    String method2(String str,boolean collapse){
      StringBuilder sbuf=null;
      int len=str.length();
      int prevSpace=collapse ? 1 : 0;
      for (int i=0; i < len; ) {
        char ch=str.charAt(i++);
        int isSpace=ch == ' ' ? 1 : ch == '\t' || ch == '\r' || ch == '\n' ? 2 : 0;
        if (sbuf == null && (isSpace == 2 || (isSpace == 1 && prevSpace > 0 && collapse) || (isSpace == 1 && i == len && collapse))) {
          sbuf=new StringBuilder();
          int k=prevSpace > 0 ? i - 2 : i - 1;
          for (int j=0; j < k; j++)       sbuf.append(str.charAt(j));
          ch=' ';
        }
        if (collapse) {
          if (prevSpace > 0 && isSpace == 0) {
            if (sbuf != null && sbuf.length() > 0)         sbuf.append(' ');
            prevSpace=0;
          }
     else       if (isSpace == 2 || (isSpace == 1 && prevSpace > 0))       prevSpace=2;
     else       if (isSpace > 0)       prevSpace=1;
     else       prevSpace=0;
          if (prevSpace > 0)       continue;
        }
        if (sbuf != null)     sbuf.append(ch);
      }
      if (sbuf != null)   return sbuf.toString();
     else   return str;
    }
}
