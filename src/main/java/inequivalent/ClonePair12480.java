package inequivalent;

public class ClonePair12480 {

    int method1(Object obj, Object[] array) {
        if (obj == null || array == null) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (obj.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    int method2(Object _obj, Object[] _objArray) {
        if ((_obj == null) || (_objArray == null)) {
            return -1;
        }
        for (int i = _objArray.length - 1; i >= 0; i--) {
            if (_obj.equals(_objArray[i])) {
                return i;
            }
        }
        return -1;
    }
}
