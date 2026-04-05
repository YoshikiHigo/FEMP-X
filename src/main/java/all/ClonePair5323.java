package all;

public class ClonePair5323 {

    int method1(String textToSearch,String pattern,int fromIndex){
      int n=pattern.length();
      while (textToSearch.length() > ((fromIndex + n) - 1)) {
        if (textToSearch.regionMatches(true,fromIndex,pattern,0,n)) {
          return fromIndex;
        }
        fromIndex++;
      }
      return -1;
    }

    int method2(String source,String pattern,int start){
      int iLength=pattern.length();
      int iLastStart=source.length() - iLength + 1;
      for (int i=start; i < iLastStart; i++) {
        if (pattern.regionMatches(true,0,source,i,iLength))     return i;
      }
      return -1;
    }
}
