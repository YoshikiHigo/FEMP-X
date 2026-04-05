package all;

public class ClonePair12797 {

    String method1(String text,String src,String tar){
      StringBuffer sb=new StringBuffer();
      if (text == null || src == null || tar == null) {
        return text;
      }
     else {
        int size=text.length();
        int gap=src.length();
        for (int start=0; start >= 0 && start < size; ) {
          int i=text.indexOf(src,start);
          if (i == -1) {
            sb.append(text.substring(start));
            start=-1;
          }
     else {
            sb.append(text.substring(start,i)).append(tar);
            start=i + gap;
          }
        }
        return sb.toString();
      }
    }

    String method2(String line,String from,String to){
      if (line == null)   return null;
      if (from == null || from.equals(""))   return "";
      StringBuffer buf=new StringBuffer();
      int line_pos=0;
      do {
        int pos=line.indexOf(from,line_pos);
        if (pos == -1)     pos=line.length();
        String chunk=line.substring(line_pos,pos);
        buf.append(chunk);
        if (pos != line.length())     buf.append(to);
        line_pos+=chunk.length() + from.length();
      }
     while (line_pos < line.length());
      return buf.toString();
    }
}
