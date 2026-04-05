package unverified;

public class ClonePair5349 {

    int method1(String source,String pattern,int start){
      int iLength=pattern.length();
      int iLastStart=source.length() - iLength + 1;
      for (int i=start; i < iLastStart; i++) {
        if (pattern.regionMatches(true,0,source,i,iLength))     return i;
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
