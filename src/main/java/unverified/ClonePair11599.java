package unverified;

public class ClonePair11599 {

    String method1(String input,String oldString,String newString){
      if (input == null || input.length() == 0 || input.indexOf(oldString,0) < 0) {
        return input;
      }
     else {
        int i=0;
        int j=0;
        int oldLength=oldString.length();
        StringBuffer buffer=new StringBuffer();
        while ((i=input.indexOf(oldString,i)) >= 0) {
          buffer.append(input.substring(j,i)).append(newString);
          j=(i+=oldLength);
        }
        input=buffer.append(input.substring(j)).toString();
        buffer=null;
        return input;
      }
    }

    String method2(String container,String tag,String replacement){
      final String BLANK="";
      StringBuffer buffer=new StringBuffer("");
      int start=0;
      int end=0;
      if (container == null || container.trim().length() == 0) {
        return container;
      }
      if (replacement == null) {
        replacement=BLANK;
      }
      end=container.indexOf(tag);
      while (end != -1) {
        buffer.append(container.substring(start,end));
        buffer.append(replacement);
        start=end + tag.length();
        end=container.indexOf(tag,start);
      }
      buffer.append(container.substring(start));
      return buffer.toString();
    }
}
