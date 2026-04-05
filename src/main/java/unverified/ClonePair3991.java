package unverified;

public class ClonePair3991 {

    String method1(String str,char beginningChar,char endingChar){
      String result=str;
      int i=0;
      int leftFirstIndex=0;
      int countRight=0;
      int countLeft=0;
      boolean lastIndexNotFound=true;
      while (i < str.length() && lastIndexNotFound) {
        final char c=str.charAt(i);
        if (c == beginningChar) {
          countLeft++;
          if (countLeft == 1) {
            leftFirstIndex=i;
          }
        }
     else     if (c == endingChar) {
          countRight++;
          if (countLeft == countRight) {
            lastIndexNotFound=false;
            result=str.substring(0,leftFirstIndex) + str.substring(i + 1,str.length());
          }
        }
        i++;
      }
      return result;
    }

    String method2(String original,char from,char to){
      StringBuffer result=new StringBuffer(original.length());
      int at, saved=0;
      do {
        at=original.indexOf(from);
        if (at >= 0) {
          result.append(original.substring(0,at));
          result.append(to);
        }
     else {
          result.append(original.substring(saved));
        }
        saved=at;
      }
     while (at >= 0);
      return result.toString();
    }
}
