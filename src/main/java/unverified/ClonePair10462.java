package unverified;

public class ClonePair10462 {

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

    String method2(String str,String pattern,String replace){
      if (replace == null) {
        replace="";
      }
      int s=0, e=0;
      StringBuffer result=new StringBuffer();
      while ((e=str.indexOf(pattern,s)) >= 0) {
        result.append(str.substring(s,e));
        result.append(replace);
        s=e + pattern.length();
      }
      if (s == 0)   return str;
      result.append(str.substring(s));
      return result.toString();
    }
}
