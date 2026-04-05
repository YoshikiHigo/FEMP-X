package unverified;

public class ClonePair13389 {

    int method1(String s,String t,int limit,int[] workspace){
      final int lenS=s.length();
      final int lenT=t.length();
      if (lenS < lenT) {
        if (lenT - lenS >= limit) {
          return limit;
        }
      }
     else   if (lenT < lenS) {
        if (lenS - lenT >= limit) {
          return limit;
        }
      }
      final int lenS1=lenS + 1;
      final int lenT1=lenT + 1;
      if (lenS1 == 1) {
        return (lenT < limit) ? lenT : limit;
      }
      if (lenT1 == 1) {
        return (lenS < limit) ? lenS : limit;
      }
      final int[] dl=workspace;
      int dlIndex=0;
      int sPrevIndex=0, tPrevIndex=0, rowBefore=0, min=0, tmp=0, best=0, cost=0;
      final int tri=lenS1 + 2;
      dlIndex=0;
      for (tmp=0; tmp < lenT1; tmp++) {
        dl[dlIndex]=tmp;
        dlIndex+=lenS1;
      }
      for (int sIndex=0; sIndex < lenS; sIndex++) {
        dlIndex=sIndex + 1;
        dl[dlIndex]=dlIndex;
        best=limit;
        for (int tIndex=0; tIndex < lenT; tIndex++) {
          rowBefore=dlIndex;
          dlIndex+=lenS1;
          min=dl[rowBefore] + 1;
          tmp=dl[dlIndex - 1] + 1;
          if (tmp < min) {
            min=tmp;
          }
          cost=1;
          if (s.charAt(sIndex) == t.charAt(tIndex)) {
            cost=0;
          }
          if (sIndex > 0 && tIndex > 0) {
            if (s.charAt(sIndex) == t.charAt(tPrevIndex) && s.charAt(sPrevIndex) == t.charAt(tIndex)) {
              tmp=dl[rowBefore - tri] + cost;
              if (tmp < min) {
                min=tmp;
              }
            }
          }
          tmp=dl[rowBefore - 1] + cost;
          if (tmp < min) {
            min=tmp;
          }
          dl[dlIndex]=min;
          if (min < best) {
            best=min;
          }
          tPrevIndex=tIndex;
        }
        if (best >= limit) {
          return limit;
        }
        sPrevIndex=sIndex;
      }
      if (dl[dlIndex] >= limit) {
        return limit;
      }
     else {
        return dl[dlIndex];
      }
    }

    int method2(String s,String t,int limit,int[] workspace){
      int lenS=s.length();
      int lenT=t.length();
      if (lenS < lenT) {
        if (lenT - lenS >= limit)     return limit;
      }
     else   if (lenT < lenS)   if (lenS - lenT >= limit)   return limit;
      int lenS1=lenS + 1;
      int lenT1=lenT + 1;
      if (lenS1 == 1)   return (lenT < limit) ? lenT : limit;
      if (lenT1 == 1)   return (lenS < limit) ? lenS : limit;
      int[] dl=workspace;
      int dlIndex=0;
      int sPrevIndex=0, tPrevIndex=0, rowBefore=0, min=0, tmp=0, best=0, cost=0;
      int tri=lenS1 + 2;
      dlIndex=0;
      for (tmp=0; tmp < lenT1; tmp++) {
        dl[dlIndex]=tmp;
        dlIndex+=lenS1;
      }
      for (int sIndex=0; sIndex < lenS; sIndex++) {
        dlIndex=sIndex + 1;
        dl[dlIndex]=dlIndex;
        best=limit;
        for (int tIndex=0; tIndex < lenT; tIndex++) {
          rowBefore=dlIndex;
          dlIndex+=lenS1;
          min=dl[rowBefore] + 1;
          tmp=dl[dlIndex - 1] + 1;
          if (tmp < min)       min=tmp;
          cost=1;
          if (s.charAt(sIndex) == t.charAt(tIndex))       cost=0;
          if (sIndex > 0 && tIndex > 0) {
            if (s.charAt(sIndex) == t.charAt(tPrevIndex) && s.charAt(sPrevIndex) == t.charAt(tIndex)) {
              tmp=dl[rowBefore - tri] + cost;
              if (tmp < min)           min=tmp;
            }
          }
          tmp=dl[rowBefore - 1] + cost;
          if (tmp < min)       min=tmp;
          dl[dlIndex]=min;
          if (min < best)       best=min;
          tPrevIndex=tIndex;
        }
        if (best >= limit)     return limit;
        sPrevIndex=sIndex;
      }
      if (dl[dlIndex] >= limit)   return limit;
     else   return dl[dlIndex];
    }
}
