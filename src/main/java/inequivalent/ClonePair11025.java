package inequivalent;

public class ClonePair11025 {

    int[] method1(int[] sc, int[] oldList, int numVerts) {
        if (oldList == null) return null;
        int[] newList = new int[numVerts];
        int vert1 = 0;
        int n = 0;
        for (int f = 0; f < sc.length; f++) {
            newList[n++] = oldList[vert1++];
            newList[n++] = oldList[vert1++];
            newList[n++] = oldList[vert1++];
            for (int t = 3; t < sc[f]; t++) {
                newList[n++] = oldList[vert1 + 2 - (t % 2)];
                vert1 += 3;
            }
        }
        return newList;
    }

    int[] method2(int[] sc, int[] oldList, int numVerts) {
        if (oldList == null) return null;
        int[] newList = new int[numVerts];
        int vert1 = 0;
        int n = 0;
        for (int f = 0; f < sc.length; f++) {
            newList[n++] = oldList[vert1++];
            newList[n++] = oldList[vert1++];
            newList[n++] = oldList[vert1++];
            for (int t = 3; t < sc[f]; t++) {
                newList[n++] = oldList[vert1 + 2];
                vert1 += 3;
            }
        }
        return newList;
    }
}
