package all;

public class ClonePair5378 {

    int method1(String str,String delims,int start){
      if (start >= str.length())   return -1;
      for (int i=start; i < str.length(); i++) {
        if (delims.indexOf(str.charAt(i)) != -1)     return i;
      }
      return -1;
    }

    int method2(String source,String charSet,int startFrom){
      for (int i=startFrom; i < source.length(); i++) {
        if (charSet.indexOf(source.charAt(i)) >= 0)     return i;
      }
      return -1;
    }
}
