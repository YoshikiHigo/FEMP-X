package unverified;

public class ClonePair12246 {

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

    String method2(String the_str,String the_old,String the_new){
      if ((the_str == null) || (the_old == null) || (the_new == null)) {
        return null;
      }
      int indx=the_str.indexOf(the_old);
      if (indx >= 0) {
        String firstPart=the_str.substring(0,indx);
        String lastPart=the_str.substring(indx + the_old.length());
        return firstPart + the_new + lastPart;
      }
      return the_str;
    }
}
