package inequivalent;

public class ClonePair38338 {

    int method1(char b) {
        if (b == 'a') return 0;
        if (b == 'c') return 1;
        if (b == 'g') return 2;
        if (b == 't') return 3;
        if (b == 'A') return 0;
        if (b == 'C') return 1;
        if (b == 'G') return 2;
        if (b == 'T') return 3;
        System.out.println("Warning, bad char found in baseNumber() in the NucleicAcid.java class ->" + b);
        return -1;
    }

    int method2(char x) {
        char y = Character.toUpperCase(x);
        if (y == 'A') {
            return 0;
        } else if (y == 'C') {
            return 1;
        } else if (y == 'G') {
            return 2;
        } else if (y == 'T') {
            return 3;
        }
        return -1;
    }
}
