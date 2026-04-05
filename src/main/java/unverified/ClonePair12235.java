package unverified;

public class ClonePair12235 {

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

    String method2(String str,String strToReplace,String replaceStr){
      if (str == null || strToReplace == null || replaceStr == null)   return null;
      StringBuffer sb=new StringBuffer();
      for (int replaceIndex=-1; (replaceIndex=str.indexOf(strToReplace)) > -1; ) {
        sb.append(String.valueOf(str.substring(0,replaceIndex)) + String.valueOf(replaceStr));
        str=str.substring(replaceIndex + strToReplace.length());
      }
      sb.append(str);
      return sb.toString();
    }
}
