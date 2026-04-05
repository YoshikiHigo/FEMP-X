package all;

public class ClonePair13054 {

    String method1(String s,String find,String replace){
      if (s == null)   return s;
      StringBuffer result=new StringBuffer();
      int index;
      while ((index=s.indexOf(find)) >= 0) {
        result.append(s.substring(0,index));
        result.append(replace);
        s=s.substring(index + find.length());
      }
      result.append(s);
      return result.toString();
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
