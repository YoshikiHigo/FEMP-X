package equivalent;

public class ClonePair12532 {
    int method1(String sql, char ch, int num) {
        for (int i = 0; i < sql.length(); i++)
            if (sql.charAt(i) == ch) {
                num--;
                if (num == 0) return i;
            }
        return -1;
    }

    int method2(String s, char c, int n) {
        int index = -1;
        while (n > 0 && (index = s.indexOf(c, index + 1)) >= 0) n -= 1;
        return index;
    }
}
