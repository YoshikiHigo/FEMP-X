package inequivalent;

public class ClonePair3802 {

    boolean[] method1(int[][] tagIdss, int numTags) {
        boolean[] legalEnds = new boolean[numTags];
        for (int[] tagIds : tagIdss) if (tagIds.length > 0) legalEnds[tagIds[tagIds.length - 1]] = true;
        return legalEnds;
    }

    boolean[] method2(int[][] tagIdss, int numTags) {
        boolean[] legalStarts = new boolean[numTags];
        for (int[] tagIds : tagIdss) if (tagIds.length > 0) legalStarts[tagIds[0]] = true;
        return legalStarts;
    }
}
