package all;

public class ClonePair10486 {

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

    String method2(String str,String repl,String with){
      int lastindex=0;
      int pos=str.indexOf(repl);
      if (pos < 0) {
        return str;
      }
      int len=repl.length();
      int lendiff=with.length() - repl.length();
      StringBuilder out=new StringBuilder((lendiff <= 0) ? str.length() : (str.length() + (lendiff << 3)));
      for (; pos >= 0; pos=str.indexOf(repl,lastindex=pos + len)) {
        out.append(str.substring(lastindex,pos)).append(with);
      }
      return out.append(str.substring(lastindex,str.length())).toString();
    }
}
