package all;

public class ClonePair13421 {

    String method1(String string,String from,String to){
      if ((string == null) || (string.length() == 0)) {
        return string;
      }
     else   if ((string.length() == 1) && string.equals(from)) {
        return to;
      }
     else   if ((string.length() == 1) && !string.equals(from)) {
        return string;
      }
      int index=-1;
      while ((index=string.indexOf(from)) >= 0) {
        string=string.substring(0,index) + (char)5 + string.substring(index + from.length());
      }
      int sunIndex=-1;
      while ((sunIndex=string.indexOf((char)5)) >= 0) {
        string=string.substring(0,sunIndex) + to + string.substring(sunIndex + 1);
      }
      return string;
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
