package all;

public class ClonePair10465 {

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

    String method2(String source,String from,String to){
      StringBuffer sb=new StringBuffer();
      int oldIndex=0, newIndex;
      while (-1 != (newIndex=source.indexOf(from,oldIndex))) {
        sb.append(source.substring(oldIndex,newIndex)).append(to);
        oldIndex=newIndex + from.length();
      }
      if (oldIndex < source.length())   sb.append(source.substring(oldIndex));
      return sb.toString();
    }
}
