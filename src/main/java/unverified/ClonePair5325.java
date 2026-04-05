package unverified;

public class ClonePair5325 {

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

    int method2(String str,String find,int n){
      int curPos=-1;
      int occurrence=-1;
      do {
        curPos=str.indexOf(find,curPos + 1);
        occurrence++;
      }
     while (occurrence < n && curPos != -1);
      return curPos;
    }
}
