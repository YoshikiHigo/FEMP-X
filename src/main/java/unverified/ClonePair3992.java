package unverified;

public class ClonePair3992 {

    String method1(String word,char openBracket,char closeBracket){
      String openBracketStr=String.valueOf(openBracket);
      String closeBracketStr=String.valueOf(closeBracket);
      StringBuilder sb=new StringBuilder(word);
      while (sb.indexOf(openBracketStr) > -1) {
        int i=sb.indexOf(openBracketStr);
        int j=sb.indexOf(closeBracketStr);
        j=(j > -1) ? j + 1 : sb.length();
        sb.delete(i,j);
      }
      return sb.toString();
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
