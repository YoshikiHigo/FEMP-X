package unverified;

public class ClonePair9259 {

    int method1(String line,int pos,String noWordSep){
      char ch=line.charAt(pos);
      if (noWordSep == null)   noWordSep="";
      boolean selectNoLetter=!Character.isLetterOrDigit(ch) && noWordSep.indexOf(ch) == -1;
      int wordEnd=line.length();
      for (int i=pos; i < line.length(); i++) {
        ch=line.charAt(i);
        if (!(selectNoLetter ^ (!Character.isLetterOrDigit(ch) && noWordSep.indexOf(ch) == -1)))     continue;
        wordEnd=i;
        break;
      }
      return wordEnd;
    }

    int method2(String line,int pos,String noWordSep){
      char ch=line.charAt(pos);
      if (noWordSep == null)   noWordSep="";
      boolean selectNoLetter=(!Character.isLetterOrDigit(ch) && noWordSep.indexOf(ch) == -1);
      int wordEnd=line.length();
      for (int i=pos; i < line.length(); i++) {
        ch=line.charAt(i);
        if (selectNoLetter ^ (!Character.isLetterOrDigit(ch) && noWordSep.indexOf(ch) == -1)) {
          wordEnd=i;
          break;
        }
      }
      return wordEnd;
    }
}
