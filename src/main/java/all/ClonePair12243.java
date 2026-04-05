package all;

public class ClonePair12243 {

    String method1(String content,String oldWord,String newWord){
      if ((content == null) || (oldWord == null) || (newWord == null)) {
        return null;
      }
      String tempString=new String(content);
      int position=tempString.indexOf(oldWord);
      while (position > -1) {
        tempString=tempString.substring(0,position) + newWord + tempString.substring(position + oldWord.length());
        position=tempString.indexOf(oldWord,position + newWord.length());
      }
      return tempString;
    }

    String method2(String from,String to,String source){
      if (source == null || from == null || to == null)   return null;
      StringBuffer bf=new StringBuffer("");
      int index=-1;
      while ((index=source.indexOf(from)) != -1) {
        bf.append(source.substring(0,index) + to);
        source=source.substring(index + from.length());
        index=source.indexOf(from);
      }
      bf.append(source);
      return bf.toString();
    }
}
