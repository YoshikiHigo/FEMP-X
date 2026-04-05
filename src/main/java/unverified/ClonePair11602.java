package unverified;

public class ClonePair11602 {

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

    String method2(String source,String find,String replace){
      if (source == null)   return null;
      StringBuffer sb=null;
      int pos;
      do {
        if ((pos=source.indexOf(find)) < 0)     break;
        if (sb == null)     sb=new StringBuffer();
        if (pos > 0)     sb.append(source.substring(0,pos));
        sb.append(replace);
        source=source.substring(pos + find.length());
      }
     while (source.length() > 0);
      if (sb == null)   return source;
     else {
        sb.append(source);
        return sb.toString();
      }
    }
}
