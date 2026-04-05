package all;

public class ClonePair13503 {

    String method1(String s,String what,String onWhat){
      if (s == null) {
        return null;
      }
      String res;
      int i;
      i=s.lastIndexOf(what);
      if (i < 0) {
        return s;
      }
      res=s.substring(0,i) + onWhat + s.substring(i + what.length());
      return res;
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
