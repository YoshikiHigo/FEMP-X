package all;

public class ClonePair12416 {

    String method1(String in,boolean stripBRTag){
      if (in == null) {
        return null;
      }
      char ch;
      int i=0;
      int last=0;
      char[] input=in.toCharArray();
      int len=input.length;
      StringBuffer out=new StringBuffer((int)(len * 1.3));
      for (; i < len; i++) {
        ch=input[i];
        if (ch > '>') {
        }
     else     if (ch == '<') {
          if (!stripBRTag && i + 3 < len && input[i + 1] == 'b' && input[i + 2] == 'r' && input[i + 3] == '>') {
            i+=3;
            continue;
          }
          if (i > last) {
            if (last > 0) {
              out.append(" ");
            }
            out.append(input,last,i - last);
          }
          last=i + 1;
        }
     else     if (ch == '>') {
          last=i + 1;
        }
      }
      if (last == 0) {
        return in;
      }
      if (i > last) {
        out.append(input,last,i - last);
      }
      return out.toString();
    }

    String method2(String in,boolean stripBRTag){
      if (in == null)   return null;
      char ch;
      int i=0;
      int last=0;
      char[] input=in.toCharArray();
      int len=input.length;
      StringBuilder out=new StringBuilder((int)(len * 1.3));
      for (; i < len; i++) {
        ch=input[i];
        if (ch > '>') {
        }
     else     if (ch == '<') {
          if (!stripBRTag && i + 3 < len && input[i + 1] == 'b' && input[i + 2] == 'r' && input[i + 3] == '>') {
            i+=3;
            continue;
          }
          if (i > last) {
            if (last > 0)         out.append(" ");
            out.append(input,last,i - last);
          }
          last=i + 1;
        }
     else     if (ch == '>') {
          last=i + 1;
        }
      }
      if (last == 0) {
        return in;
      }
      if (i > last) {
        out.append(input,last,i - last);
      }
      return out.toString();
    }
}
