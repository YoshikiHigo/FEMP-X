package all;

public class ClonePair10403 {

    int method1(String str,int startAt){
      int i;
      boolean first=true;
      for (i=startAt; i < str.length(); ++i) {
        if ((first == true) && (Character.isLetter(str.charAt(i)) == false))     break;
     else     if (Character.isLetterOrDigit(str.charAt(i)) == false)     break;
        first=false;
      }
      return i;
    }

    int method2(String text,int start){
      int len=text.length();
      while (start < len) {
        if (!Character.isLetter(text.charAt(start)))     break;
        ++start;
      }
      return start;
    }
}
