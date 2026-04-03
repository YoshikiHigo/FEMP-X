package equivalent;

public class ClonePair4929 {
    boolean method1(int ano) {
        boolean bisiesto;
        if (ano % 4 != 0) {
            bisiesto = false;
        } else if (ano % 400 == 0) {
            bisiesto = true;
        } else bisiesto = ano % 100 != 0;
        return bisiesto;
    }

    boolean method2(int year) {
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                }
            } else {
                leap = true;
            }
        }
        return leap;
    }
}
