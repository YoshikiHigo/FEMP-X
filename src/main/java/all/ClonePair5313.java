package all;

public class ClonePair5313 {

    int method1(String s,String t,int[] workspace){
      final int lenS=s.length();
      final int lenT=t.length();
      final int lenS1=lenS + 1;
      final int lenT1=lenT + 1;
      if (lenT1 == 1) {
        return lenS1 - 1;
      }
      if (lenS1 == 1) {
        return lenT1 - 1;
      }
      final int[] dl=workspace;
      int dlIndex=0;
      int sPrevIndex=0, tPrevIndex=0, rowBefore=0, min=0, cost=0, tmp=0;
      dlIndex=0;
      for (tmp=0; tmp < lenT1; tmp++) {
        dl[dlIndex]=tmp;
        dlIndex+=lenS1;
      }
      for (int sIndex=0; sIndex < lenS; sIndex++) {
        dlIndex=sIndex + 1;
        dl[dlIndex]=dlIndex;
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
          tmp=dl[rowBefore - 1] + cost;
          if (tmp < min) {
            min=tmp;
          }
          dl[dlIndex]=min;
          tPrevIndex=tIndex;
        }
        sPrevIndex=sIndex;
      }
      return dl[dlIndex];
    }

    int method2(String s,String t,int[] workspace){
      int lenS=s.length();
      int lenT=t.length();
      int lenS1=lenS + 1;
      int lenT1=lenT + 1;
      if (lenT1 == 1)   return lenS1 - 1;
      if (lenS1 == 1)   return lenT1 - 1;
      int[] dl=workspace;
      int dlIndex=0;
      int sPrevIndex=0, tPrevIndex=0, rowBefore=0, min=0, cost=0, tmp=0;
      int tri=lenS1 + 2;
      dlIndex=0;
      for (tmp=0; tmp < lenT1; tmp++) {
        dl[dlIndex]=tmp;
        dlIndex+=lenS1;
      }
      for (int sIndex=0; sIndex < lenS; sIndex++) {
        dlIndex=sIndex + 1;
        dl[dlIndex]=dlIndex;
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
          tPrevIndex=tIndex;
        }
        sPrevIndex=sIndex;
      }
      return dl[dlIndex];
    }
}
