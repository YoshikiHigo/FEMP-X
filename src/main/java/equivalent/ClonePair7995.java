package equivalent;

public class ClonePair7995 {
    Object method1(int row, int col) {
        if (col == 0) {
            if (row == 0) {
                return "Voiced";
            } else {
                if (row == 1) {
                    return "Unvoiced";
                } else {
                    if (row == 2) {
                        return "Track";
                    }
                }
            }
        }
        return Integer.valueOf(0);
    }

    Object method2(int row, int col) {
        if (col == 0) {
            if (row == 0) return "Voiced";
            else if (row == 1) return "Unvoiced";
            else if (row == 2) return "Track";
        }
        return Integer.valueOf(0);
    }
}
