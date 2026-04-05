package unverified;

public class ClonePair12244 {

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

    String method2(String haystack,String needle,String replace){
      boolean issub=false;
      if (haystack == null || needle == null || replace == null)   return null;
      if (replace.indexOf(needle) > -1)   issub=true;
      int offset=0;
      while (true) {
        int pos=haystack.indexOf(needle,offset);
        if (pos > -1) {
          if (issub && haystack.indexOf(replace,offset) == pos) {
            offset=pos + 1;
            continue;
          }
          haystack=haystack.substring(0,pos) + replace + haystack.substring(pos + needle.length());
        }
     else     break;
      }
      return haystack;
    }
}
