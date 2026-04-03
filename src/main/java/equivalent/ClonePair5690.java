package equivalent;

public class ClonePair5690 {
    boolean method1(int ano) {
        int in;
        if ((ano / 100) * 100 != ano) {
            return (ano / 4) * 4 == ano;
        } else {
            in = ano / 100;
            if ((in / 4) * 4 != in) return false;
            in = in * 100;
            ano = ano - in;
            return (ano / 4) * 4 == ano;
        }
    }

    boolean method2(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
