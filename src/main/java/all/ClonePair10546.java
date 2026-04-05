package all;

public class ClonePair10546 {

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

    String method2(String s,String find,String replace){
      int found=s.indexOf(find);
      if (found == -1) {
        return s;
      }
      StringBuffer sb=new StringBuffer(s.length());
      int start=0;
      for (; ; ) {
        for (; start < found; start++) {
          sb.append(s.charAt(start));
        }
        if (found == s.length()) {
          break;
        }
        sb.append(replace);
        start+=find.length();
        found=s.indexOf(find,start);
        if (found == -1) {
          found=s.length();
        }
      }
      return sb.toString();
    }
}
