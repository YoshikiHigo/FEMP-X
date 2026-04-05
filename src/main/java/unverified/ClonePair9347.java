package unverified;

public class ClonePair9347 {

    int method1(String str,int startAt){
      int i;
      for (i=startAt; i < str.length(); ++i)   if (Character.isLetter(str.charAt(i)) == false)   break;
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
