package unverified;

public class ClonePair10539 {

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

    String method2(String line,String oldString,String newString){
      int i=0;
      if ((i=line.indexOf(oldString,i)) >= 0) {
        char line2[]=line.toCharArray();
        char newString2[]=newString.toCharArray();
        int oLength=oldString.length();
        StringBuffer buf=new StringBuffer(line2.length);
        buf.append(line2,0,i).append(newString2);
        i+=oLength;
        int j;
        for (j=i; (i=line.indexOf(oldString,i)) > 0; j=i) {
          buf.append(line2,j,i - j).append(newString2);
          i+=oLength;
        }
        buf.append(line2,j,line2.length - j);
        return buf.toString();
      }
     else {
        return line;
      }
    }
}
