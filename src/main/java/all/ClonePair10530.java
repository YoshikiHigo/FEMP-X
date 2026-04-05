package all;

public class ClonePair10530 {

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

    String method2(String orig,String find,String repl){
      StringBuffer buf=new StringBuffer();
      int pos=0;
      while (pos < orig.length()) {
        int foundPos=orig.indexOf(find,pos);
        if (foundPos == -1) {
          break;
        }
     else {
          buf.append(orig.substring(pos,foundPos));
          buf.append(repl);
          pos=foundPos + find.length();
        }
      }
      buf.append(orig.substring(pos));
      return buf.toString();
    }
}
