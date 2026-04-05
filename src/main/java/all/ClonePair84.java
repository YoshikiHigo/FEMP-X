package all;

public class ClonePair84 {

    int method1(char[] source,int sourceOffset,int sourceCount,char[] target,int targetOffset,int targetCount,int fromIndex){
      if (fromIndex >= sourceCount) {
        return (targetCount == 0 ? sourceCount : -1);
      }
      if (fromIndex < 0) {
        fromIndex=0;
      }
      if (targetCount == 0) {
        return fromIndex;
      }
      char first=target[targetOffset];
      char firstLower=Character.toLowerCase(first);
      int max=sourceOffset + (sourceCount - targetCount);
      for (int i=sourceOffset + fromIndex; i <= max; i++) {
        if (Character.toLowerCase(source[i]) != firstLower) {
          while (++i <= max && Character.toLowerCase(source[i]) != firstLower)       ;
        }
        if (i <= max) {
          int j=i + 1;
          int end=j + targetCount - 1;
          for (int k=targetOffset + 1; j < end; j++, k++) {
            char sch=source[j];
            char tch=target[k];
            if (sch != tch && Character.toLowerCase(sch) != Character.toLowerCase(tch)) {
              break;
            }
          }
          if (j == end) {
            return i - sourceOffset;
          }
        }
      }
      return -1;
    }

    int method2(char[] source,int sourceOffset,int sourceCount,char[] target,int targetOffset,int targetCount,int fromIndex){
      if (fromIndex >= sourceCount) {
        return (targetCount == 0 ? sourceCount : -1);
      }
      if (fromIndex < 0) {
        fromIndex=0;
      }
      if (targetCount == 0) {
        return fromIndex;
      }
      char first=target[targetOffset];
      int max=sourceOffset + (sourceCount - targetCount);
      for (int i=sourceOffset + fromIndex; i <= max; i++) {
        if (source[i] != first) {
          while (++i <= max && source[i] != first)       ;
        }
        if (i <= max) {
          int j=i + 1;
          int end=j + targetCount - 1;
          for (int k=targetOffset + 1; j < end && source[j] == target[k]; j++, k++)       ;
          if (j == end) {
            return i - sourceOffset;
          }
        }
      }
      return -1;
    }
}
