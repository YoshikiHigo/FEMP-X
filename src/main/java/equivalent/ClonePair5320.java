package equivalent;

public class ClonePair5320 {
    int method1(int items, int itemsPerPage) {
        int mod = items % itemsPerPage;
        int div = items / itemsPerPage;
        if (mod == 0) return div;
        return div + 1;
    }

    int method2(int diff, int tileSize) {
        int tiles = diff / tileSize;
        if ((diff % tileSize) != 0) ++tiles;
        return tiles;
    }
}
