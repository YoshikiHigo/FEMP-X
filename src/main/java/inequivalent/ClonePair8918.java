package inequivalent;

public class ClonePair8918 {

    int[][] method1(byte[][][] pixelMap, int ySize, int xSize) {
        int[][] raster = new int[pixelMap[0].length][pixelMap[0][0].length];
        for (int y = 0; y < ySize; y++) {
            for (int x = 0; x < xSize; x++) {
                raster[y][x] = (pixelMap[4][y][x] << 24) | (pixelMap[0][y][x] << 16) | (pixelMap[1][y][x] << 8) | pixelMap[2][y][x];
            }
        }
        return raster;
    }

    int[][] method2(byte[][][] pixelMap, int ySize, int xSize) {
        int[][] raster = new int[pixelMap[0].length][pixelMap[0][0].length];
        for (int y = 0; y < ySize; y++) {
            for (int x = 0; x < xSize; x++) {
                int alpha = 0xFF;
                int red = pixelMap[0][y][x];
                int green = pixelMap[1][y][x];
                int blue = pixelMap[2][y][x];
                raster[y][x] = (alpha << 24) | (red << 16) | (green << 8) | red;
            }
        }
        return raster;
    }
}
