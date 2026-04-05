package unverified;

public class ClonePair11181 {

    String method1(String str,String from,String to){
      if (str == null)   return str;
      int index=str.indexOf(from);
      if (index == -1)   return str;
      int pos=0;
      final int fromLen=from.length();
      final StringBuilder sb=new StringBuilder();
      while (index > -1) {
        sb.append(str.substring(pos,index)).append(to);
        pos=index + fromLen;
        index=str.indexOf(from,pos);
      }
      sb.append(str.substring(pos));
      return sb.toString();
    }

    String method2(String line,String oldString,String newString){
      if (line == null) {
        return null;
      }
      final int i=line.indexOf(oldString);
      if (i < 0) {
        return line;
      }
      final StringBuffer buf=new StringBuffer(line.substring(0,i));
      buf.append(newString);
      buf.append(line.substring(i + oldString.length()));
      return buf.toString();
    }
}
