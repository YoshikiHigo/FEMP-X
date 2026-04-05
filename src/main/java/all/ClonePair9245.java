package all;

public class ClonePair9245 {

    int method1(String line,int pos,String noWordSep){
      char ch=line.charAt(pos - 1);
      if (noWordSep == null) {
        noWordSep="";
      }
      boolean selectNoLetter=(!Character.isLetterOrDigit(ch) && (noWordSep.indexOf(ch) == -1));
      int wordStart=0;
      for (int i=pos - 1; i >= 0; i--) {
        ch=line.charAt(i);
        if (selectNoLetter ^ (!Character.isLetterOrDigit(ch) && (noWordSep.indexOf(ch) == -1))) {
          wordStart=i + 1;
          break;
        }
      }
      return wordStart;
    }

    int method2(String line,int pos,String noWordSep){
      char ch=line.charAt(pos - 1);
      if (noWordSep == null) {
        noWordSep="";
      }
      boolean selectNoLetter=(!Character.isLetterOrDigit(ch) && noWordSep.indexOf(ch) == -1);
      int wordStart=0;
      for (int i=pos - 1; i >= 0; i--) {
        ch=line.charAt(i);
        if (selectNoLetter ^ (!Character.isLetterOrDigit(ch) && noWordSep.indexOf(ch) == -1)) {
          wordStart=i + 1;
          break;
        }
      }
      return wordStart;
    }
}
