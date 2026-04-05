package all;

public class ClonePair88 {

    int method1(char[] source,int sourceOffset,int sourceCount,char[] target,int targetOffset,int targetCount,int fromIndex){
      int rightIndex=sourceCount - targetCount;
      if (fromIndex < 0) {
        return -1;
      }
      if (fromIndex > rightIndex) {
        fromIndex=rightIndex;
      }
      if (targetCount == 0) {
        return fromIndex;
      }
      int strLastIndex=targetOffset + targetCount - 1;
      char strLastChar=Character.toLowerCase(target[strLastIndex]);
      int min=sourceOffset + targetCount - 1;
      int i=min + fromIndex;
      startSearchForLastChar:   while (true) {
        while (i >= min && Character.toLowerCase(source[i]) != strLastChar) {
          i--;
        }
        if (i < min) {
          return -1;
        }
        int j=i - 1;
        int start=j - (targetCount - 1);
        int k=strLastIndex - 1;
        while (j > start) {
          if (Character.toLowerCase(source[j--]) != Character.toLowerCase(target[k--])) {
            i--;
            continue startSearchForLastChar;
          }
        }
        return start - sourceOffset + 1;
      }
    }

    int method2(char[] source,int sourceOffset,int sourceCount,char[] target,int targetOffset,int targetCount,int fromIndex){
      int rightIndex=sourceCount - targetCount;
      if (fromIndex < 0) {
        return -1;
      }
      if (fromIndex > rightIndex) {
        fromIndex=rightIndex;
      }
      if (targetCount == 0) {
        return fromIndex;
      }
      int strLastIndex=targetOffset + targetCount - 1;
      char strLastChar=target[strLastIndex];
      int min=sourceOffset + targetCount - 1;
      int i=min + fromIndex;
      startSearchForLastChar:   while (true) {
        while (i >= min && source[i] != strLastChar) {
          i--;
        }
        if (i < min) {
          return -1;
        }
        int j=i - 1;
        int start=j - (targetCount - 1);
        int k=strLastIndex - 1;
        while (j > start) {
          if (source[j--] != target[k--]) {
            i--;
            continue startSearchForLastChar;
          }
        }
        return start - sourceOffset + 1;
      }
    }
}
