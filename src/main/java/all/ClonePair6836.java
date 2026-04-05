package all;

public class ClonePair6836 {

    int method1(byte[] src,int offs,int nsrc,byte[] pat,int offp,int npat,int from){
      if (from >= nsrc)   return npat == 0 ? nsrc : -1;
      if (from < 0)   from=0;
      if (npat == 0)   return from;
      final byte first=pat[offp];
      final int max=offs + (nsrc - npat);
      for (int i=offs + from; i <= max; i++) {
        if (src[i] != first)     while (++i <= max && src[i] != first)     ;
        if (i <= max) {
          int j=i + 1;
          int end=j + npat - 1;
          for (int k=offp + 1; j < end && src[j] == pat[k]; j++, k++)       ;
          if (j == end)       return i - offs;
        }
      }
      return -1;
    }

    int method2(byte[] source,int sourceOffset,int sourceCount,byte[] target,int targetOffset,int targetCount,int fromIndex){
      if (fromIndex >= sourceCount) {
        return (targetCount == 0 ? sourceCount : -1);
      }
      if (fromIndex < 0) {
        fromIndex=0;
      }
      if (targetCount == 0) {
        return fromIndex;
      }
      byte first=target[targetOffset];
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
