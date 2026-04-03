package equivalent;

public class ClonePair5449 {
    boolean method1(String key, String value) {
        boolean load;
        int pos1;
        if (key.startsWith("sfx.")) {
            if ((pos1 = value.indexOf(',')) > -1) {
                load = value.substring(pos1 + 1).charAt(0) != 'x';
            } else {
                load = true;
            }
            load |= value.indexOf('.') != -1;
            return load;
        } else {
            return false;
        }
    }

    boolean method2(String key, String value) {
        boolean load;
        int pos1;
        if (key.startsWith("sfx.")) {
            pos1 = value.indexOf(',');
            if (pos1 > -1) {
                load = value.substring(pos1 + 1).charAt(0) != 'x';
            } else {
                load = true;
            }
            load |= value.indexOf('.') != -1;
            return load;
        } else {
            return false;
        }
    }
}
