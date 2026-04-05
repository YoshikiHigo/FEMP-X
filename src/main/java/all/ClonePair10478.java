package all;

public class ClonePair10478 {

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

    String method2(String src,String replace,String with){
      String result;
      int pos;
      result="";
      while (!src.equals("")) {
        pos=src.indexOf(replace);
        if (pos == -1) {
          result+=src;
          src="";
        }
     else {
          result+=src.substring(0,pos) + with;
          src=src.substring(pos + replace.length(),src.length());
        }
      }
      return result;
    }
}
