package unverified;

public class ClonePair12236 {

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

    String method2(String text,String fromText,String toText){
      if (text == null || fromText == null || toText == null) {
        return null;
      }
      final StringBuffer buf=new StringBuffer(128);
      int pos=0;
      int pos2=0;
      while (true) {
        pos=text.indexOf(fromText,pos2);
        if (pos == 0) {
          buf.append(toText);
          pos2=fromText.length();
        }
     else     if (pos > 0) {
          buf.append(text.substring(pos2,pos));
          buf.append(toText);
          pos2=pos + fromText.length();
        }
     else {
          buf.append(text.substring(pos2));
          break;
        }
      }
      return buf.toString();
    }
}
