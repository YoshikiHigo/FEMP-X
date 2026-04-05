package unverified;

public class ClonePair11577 {

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

    String method2(String errorMessage,String replaced,String included){
      if (replaced.equals(included))   return errorMessage;
      String message=new String(errorMessage);
      int index=0;
      while ((index=message.lastIndexOf(replaced)) != -1) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(message.substring(0,index > 0 ? index : 0));
        buffer.append(included);
        buffer.append(message.substring(index + replaced.length()));
        message=buffer.toString();
      }
      return message;
    }
}
