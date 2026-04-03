package equivalent;

public class ClonePair13407 {
    boolean method1(byte[] a, byte[] b) {
        if (a.length < b.length) return false;
        for (int i = 0; i < b.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    boolean method2(byte[] toTest, byte[] tester) {
        if (toTest.length < tester.length) {
            return false;
        }
        for (int i = 0; i < tester.length; i++) {
            if (toTest[i] != tester[i]) {
                return false;
            }
        }
        return true;
    }
}
