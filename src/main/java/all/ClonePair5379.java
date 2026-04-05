package all;

public class ClonePair5379 {

    int method1(String str,String delims,int start){
      if (start >= str.length())   return -1;
      for (int i=start; i < str.length(); i++) {
        if (delims.indexOf(str.charAt(i)) != -1)     return i;
      }
      return -1;
    }

    int method2(String subject,String chars,int start){
      for (int i=start; i < subject.length(); ++i)   if (chars.indexOf(subject.charAt(i)) != -1)   return i;
      return -1;
    }
}
