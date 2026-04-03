package equivalent;

public class ClonePair1818 {
    boolean method1(byte[] Hash_1, byte[] Hash_2) {
        boolean Result;
        int j, jEnd;
        Result = (Hash_1.length == Hash_2.length);
        for (j = 1, jEnd = Hash_1.length; Result && j <= jEnd; j++) Result = (Hash_1[j - 1] == Hash_2[j - 1]);
        return Result;
    }

    boolean method2(byte[] d1, byte[] d2) {
        if (d1.length != d2.length) {
            return false;
        }
        for (int i = 0; i < d1.length; i++) {
            if (d1[i] != d2[i]) return false;
        }
        return true;
    }
}
