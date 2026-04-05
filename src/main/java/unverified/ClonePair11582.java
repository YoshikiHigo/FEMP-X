package unverified;

public class ClonePair11582 {

    String method1(String source,String target,String replacement){
      if (source == null) {
        return source;
      }
      String retvalue=source;
      int index=0;
      int previousIndex=0;
      if (source.indexOf(target) > -1) {
        StringBuffer hold=new StringBuffer();
        while (true) {
          index=source.indexOf(target,previousIndex);
          if (index < 0) {
            hold.append(source.substring(previousIndex));
            break;
          }
          hold.append(source.substring(previousIndex,index));
          hold.append(replacement);
          previousIndex=index + target.length();
        }
        retvalue=hold.toString();
      }
      return retvalue;
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
