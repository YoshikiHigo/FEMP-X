package all;

public class ClonePair10487 {

    String method1(String input,String searchStr,String replaceWithStr){
      StringBuffer buffer=new StringBuffer();
      int startIndex=0;
      int oldIndex=0;
      if (input.indexOf(searchStr) == -1) {
        return input;
      }
      while ((startIndex=input.indexOf(searchStr,oldIndex)) != -1) {
        buffer.append(input.substring(oldIndex,startIndex));
        buffer.append(replaceWithStr);
        startIndex+=searchStr.length();
        oldIndex=startIndex;
        if (oldIndex >= input.length()) {
          break;
        }
      }
      if (oldIndex < input.length()) {
        buffer.append(input.substring(oldIndex));
      }
      return buffer.toString();
    }

    String method2(String text,String repl,String with){
      int c=0;
      int i=text.indexOf(repl,c);
      if (i == -1)   return text;
      StringBuffer buf=new StringBuffer(text.length() + with.length());
    synchronized (buf) {
        do {
          buf.append(text.substring(c,i));
          buf.append(with);
          c=i + repl.length();
        }
     while ((i=text.indexOf(repl,c)) != -1);
        if (c < text.length())     buf.append(text.substring(c,text.length()));
        return buf.toString();
      }
    }
}
