package unverified;

public class ClonePair13092 {

    String method1(String source,String from,String to){
      StringBuffer sb=new StringBuffer();
      int oldIndex=0, newIndex;
      while (-1 != (newIndex=source.indexOf(from,oldIndex))) {
        sb.append(source.substring(oldIndex,newIndex)).append(to);
        oldIndex=newIndex + from.length();
      }
      if (oldIndex < source.length())   sb.append(source.substring(oldIndex));
      return sb.toString();
    }

    String method2(String text,String find,String replace){
      int replaceStart=text.indexOf(find);
      if (replaceStart == -1)   return text;
      int findLength=find.length();
      StringBuffer toReturn=new StringBuffer();
      while (replaceStart != -1) {
        toReturn.append(text.substring(0,replaceStart));
        toReturn.append(replace);
        text=text.substring(replaceStart + findLength);
        replaceStart=text.indexOf(find);
      }
      toReturn.append(text);
      return toReturn.toString();
    }
}
