package equivalent;

public class ClonePair5499 {
    boolean method1(int year) {
        final int modFour = year & 0x0003, modHundred = year % 100;
        return ((0 == modFour) && (modHundred != 0)) || ((0 == modHundred) && (0 == (modHundred & 0x0003)));
    }

    boolean method2(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}
