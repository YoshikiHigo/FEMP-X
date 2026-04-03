package equivalent;

public class ClonePair12637 {
    boolean method1(char rank, char startRank, char endRank) {
        if (rank > startRank && rank < endRank) return true;
        else return rank > endRank && rank < startRank;
    }

    boolean method2(char rank, char startRank, char endRank) {
        if (rank > startRank && rank < endRank) {
            return true;
        } else return rank > endRank && rank < startRank;
    }
}
