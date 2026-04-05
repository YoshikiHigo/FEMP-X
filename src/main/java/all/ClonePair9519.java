package all;

public class ClonePair9519 {

    String method1(String line,String from,String to){
      if (line == null) {
        return null;
      }
      if (from == null || from.equals("")) {
        return "";
      }
      StringBuffer buf=new StringBuffer();
      int line_pos=0;
      do {
        int pos=line.indexOf(from,line_pos);
        if (pos == -1) {
          pos=line.length();
        }
        String chunk=line.substring(line_pos,pos);
        buf.append(chunk);
        if (pos != line.length()) {
          buf.append(to);
        }
        line_pos+=chunk.length() + from.length();
      }
     while (line_pos < line.length());
      return buf.toString();
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
