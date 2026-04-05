package all;

public class ClonePair12237 {

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

    String method2(String source,String oldtext,String newtext){
      if (source == null || oldtext == null || newtext == null)   return null;
      String temp1=source;
      String temp="";
      for (int index=temp1.indexOf(oldtext); index >= 0; index=temp1.indexOf(oldtext)) {
        temp=String.valueOf(String.valueOf((new StringBuffer(String.valueOf(String.valueOf(temp)))).append(temp1.substring(0,index)).append(newtext)));
        temp1=temp1.substring(index + oldtext.length(),temp1.length());
      }
      temp=String.valueOf(temp) + String.valueOf(temp1);
      return temp;
    }
}
