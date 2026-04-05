package all;

public class ClonePair12242 {

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

    String method2(String s,String oldSub,String newSub){
      if ((s == null) || (oldSub == null) || (newSub == null)) {
        return null;
      }
      int y=s.indexOf(oldSub);
      if (y >= 0) {
        StringBuilder sb=new StringBuilder();
        int length=oldSub.length();
        int x=0;
        while (x <= y) {
          sb.append(s.substring(x,y));
          sb.append(newSub);
          x=y + length;
          y=s.indexOf(oldSub,x);
        }
        sb.append(s.substring(x));
        return sb.toString();
      }
     else {
        return s;
      }
    }
}
