package inequivalent;

public class ClonePair5955 {

    int method1(int x, int y) {
        if (x == 0 && y == 7) return 0;
        else if (x == 1 && y == 6) return 1;
        else if (x == 1 && y == 7) return 2;
        else if (x == 2 && y == 6) return 3;
        else if (x == 2 && y == 7) return 4;
        else if (x == 3 && y == 7) return 5;
        else if (x == 4 && y == 6) return 6;
        else if (x == 4 && y == 7) return 7;
        else if (x == 5 && y == 6) return 8;
        else if (x == 5 && y == 7) return 9;
        else if (x == 6 && y == 6) return 10;
        else if (x == 6 && y == 7) return 11;
        else return 0;
    }

    int method2(int kids, int quantity) {
        int result = 0;
        int[] colors = new int[5];
        while (kids > 0) {
            boolean found = false;
            for (int i = 0; i < colors.length; i++) {
                if (colors[i] >= quantity) {
                    colors[i] -= quantity;
                    kids--;
                    found = true;
                    break;
                }
            }
            if (!found) {
                result++;
                int c = 20;
                while (c > 0) {
                    for (int i = 0; i < colors.length; i++) {
                        if (c > 0 && colors[i] == 0) {
                            if (c > quantity - 1) {
                                colors[i] += quantity - 1;
                                c -= quantity - 1;
                            } else {
                                colors[i] += c;
                                c = 0;
                                break;
                            }
                        }
                    }
                    for (int i = 0; i < colors.length; i++) {
                        if (c > 0 && colors[i] == 0) {
                            if (c > quantity - 1) {
                                colors[i] += quantity - 1;
                                c -= quantity - 1;
                            } else {
                                colors[i] += c;
                                c = 0;
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("result = " + result);
        return result;
    }
}
