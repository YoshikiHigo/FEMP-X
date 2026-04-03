package inequivalent;

public class ClonePair956 {

    int[][] method1(String[] hits) {
        int lenOfAHit = hits[0].length();
        int len = hits.length;
        int[][] matrix = new int[lenOfAHit][4];
        for (int i = 0; i < lenOfAHit; i++) {
            int As = 0;
            int Cs = 0;
            int Gs = 0;
            int Ts = 0;
            for (int j = 0; j < len; j++) {
                char test = hits[j].charAt(i);
                switch (test) {
                    case 'a':
                    case 'A':
                        As++;
                        break;
                    case 'c':
                    case 'C':
                        Cs++;
                        break;
                    case 'g':
                    case 'G':
                        Gs++;
                        break;
                    case 't':
                    case 'T':
                        Ts++;
                        break;
                    default:
                        System.out.println("\n\nFatal error: odd base in makeFrequencyMatrix hits -> " + test + "\n\n");
                        System.exit(0);
                }
            }
            int[] counts = {As, Cs, Gs, Ts};
            matrix[i] = counts;
        }
        return matrix;
    }

    int[][] method2(String[] hits) {
        int lenOfAHit = hits[0].length();
        int len = hits.length;
        int[][] matrix = new int[lenOfAHit][4];
        System.out.println("      \tAs\tCs\tGs\tTs");
        for (int i = 0; i < lenOfAHit; i++) {
            int As = 0;
            int Cs = 0;
            int Gs = 0;
            int Ts = 0;
            for (int j = 0; j < len; j++) {
                char test = hits[j].charAt(i);
                switch (test) {
                    case 'a':
                    case 'A':
                        As++;
                        break;
                    case 'c':
                    case 'C':
                        Cs++;
                        break;
                    case 'g':
                    case 'G':
                        Gs++;
                        break;
                    case 't':
                    case 'T':
                        Ts++;
                        break;
                    default:
                        System.out.println("\n\nFatal error: odd base in makeFrequencyMactrix base -> " + test + "\n\n");
                        System.exit(0);
                }
            }
            System.out.println("Pos: " + (i + 1) + "\t" + As + "\t" + Cs + "\t" + Gs + "\t" + Ts);
            int[] counts = {As, Cs, Gs, Ts};
            matrix[i] = counts;
        }
        return matrix;
    }
}
