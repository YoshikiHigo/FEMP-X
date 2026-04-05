package all;

public class ClonePair12486 {

    String method1(String string,String oldPattern,String newPattern){
      if (string == null)   return string;
      int oldIndex=string.indexOf(oldPattern);
      if (oldIndex < 0)   return string;
      StringBuffer returnVal=new StringBuffer();
      int start=0;
      do {
        returnVal.append(string.substring(start,oldIndex));
        returnVal.append(newPattern);
        start=oldIndex + oldPattern.length();
        oldIndex=string.indexOf(oldPattern,start);
      }
     while (oldIndex > 0);
      returnVal.append(string.substring(start));
      return returnVal.toString();
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
