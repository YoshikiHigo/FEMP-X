package inequivalent;

public class ClonePair7895 {

    int method1(int mes, int ano) {
        int[] ud = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && ano % 4 == 0) {
            return 29;
        }
        return ud[mes - 1];
    }

    int method2(int month, int year) {
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 400 == 0) {
            dom[1] = 29;
        } else {
            if (year % 4 == 0 && year % 100 != 0) {
                dom[1] = 29;
            }
        }
        return dom[month - 1];
    }
}
