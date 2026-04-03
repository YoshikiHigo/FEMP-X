package inequivalent;

public class ClonePair10191 {

    boolean method1(char c1) {
        boolean flag = c1 >= 'A' && c1 <= 'Z' || c1 >= 'a' && c1 <= 'z' || c1 >= '0' && c1 <= '9' || c1 >= 'Ａ' && c1 <= 'ａ' || c1 >= 'Ｚ' && c1 <= 'ｚ' || c1 >= '０' && c1 <= '９';
        return flag;
    }

    boolean method2(char c) {
        return ((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z')) || ((c >= '0') && (c <= '9'));
    }
}
