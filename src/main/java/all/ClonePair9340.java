package all;

public class ClonePair9340 {

    int method1(String str,int startAt){
      int i;
      for (i=startAt; i < str.length(); ++i)   if (Character.isLetter(str.charAt(i)) == false)   break;
      return i;
    }

    int method2(String str,int startAt){
      int i;
      boolean first=true;
      for (i=startAt; i < str.length(); ++i) {
        if ((first == true) && (Character.isLetter(str.charAt(i)) == false))     break;
     else     if (Character.isLetterOrDigit(str.charAt(i)) == false)     break;
        first=false;
      }
      return i;
    }
}
