package all;

public class ClonePair12637 {

    boolean method1(char rank,char startRank,char endRank){
      if (rank > startRank && rank < endRank)   return true;
     else   if (rank > endRank && rank < startRank)   return true;
     else   return false;
    }

    boolean method2(char rank,char startRank,char endRank){
      if (rank > startRank && rank < endRank) {
        return true;
      }
     else   if (rank > endRank && rank < startRank) {
        return true;
      }
     else {
        return false;
      }
    }
}
