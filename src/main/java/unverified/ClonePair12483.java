package unverified;

public class ClonePair12483 {

    int method1(Object o,Object[] os){
      if (o == null || os == null)   return -1;
      for (int i=0; i < os.length; i++) {
        if (o.equals(os[i]))     return i;
      }
      return -1;
    }

    int method2(Object _obj,Object[] _objArray){
      if ((_obj == null) || (_objArray == null)) {
        return -1;
      }
      for (int i=_objArray.length - 1; i >= 0; i--) {
        if (_obj.equals(_objArray[i])) {
          return i;
        }
      }
      return -1;
    }
}
