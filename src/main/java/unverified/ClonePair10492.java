package unverified;

public class ClonePair10492 {

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

    String method2(String original,String regex,String replacement){
      int index=0;
      String newString=original;
      while ((newString.contains(regex)) && (regex.compareTo(replacement) != 0)) {
        index=newString.indexOf(regex);
        newString=newString.substring(0,index) + replacement + newString.substring(index + regex.length(),newString.length());
      }
      return newString;
    }
}
