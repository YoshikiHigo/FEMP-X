package all;

public class ClonePair10552 {

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

    String method2(String s,String sub,String with){
      StringBuffer sb=new StringBuffer(s.length() * 2);
      int c=0;
      int i=0;
      while ((i=s.indexOf(sub,c)) != -1) {
        sb.append(s.substring(c,i));
        sb.append(with);
        c=i + sub.length();
      }
      if (c < s.length())   sb.append(s.substring(c,s.length()));
      return sb.toString();
    }
}
