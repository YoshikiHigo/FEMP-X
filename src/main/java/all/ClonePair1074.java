package all;

public class ClonePair1074 {

    int method1(Object[] _array,Object _objectToFound){
      if ((_array == null) || (_objectToFound == null)) {
        return -1;
      }
      for (int i=_array.length - 1; i >= 0; i--) {
        if (_objectToFound == _array[i]) {
          return i;
        }
      }
      return -1;
    }

    int method2(Object[] _array,Object _objectToFound){
      if ((_array == null) || (_objectToFound == null)) {
        return -1;
      }
      for (int i=_array.length - 1; i >= 0; i--) {
        if (_objectToFound.equals(_array[i])) {
          return i;
        }
      }
      return -1;
    }
}
