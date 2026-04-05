package unverified;

public class ClonePair11708 {

    String method1(String initialString,String toReplace,String replacement){
      if (initialString == null) {
        return null;
      }
      if (toReplace != null && !(toReplace.equals("")) && replacement != null) {
        StringBuffer stb=new StringBuffer();
        int index=initialString.indexOf(toReplace);
        int oldIndex=0;
        while (index != -1) {
          stb.append(initialString.substring(oldIndex,index));
          stb.append(replacement);
          oldIndex=index + toReplace.length();
          index=initialString.indexOf(toReplace,index + toReplace.length());
        }
        stb.append(initialString.substring(oldIndex));
        return stb.toString();
      }
     else {
        return initialString;
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
