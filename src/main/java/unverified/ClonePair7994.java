package unverified;

public class ClonePair7994 {

    String method1(byte[] _b,int _o,int _l){
      int i;
      for (i=_o; i < _o + _l; i++)   if (_b[i] == 0)   break;
      return new String(_b,_o,i - _o);
    }

    String method2(byte[] array,int offset,int length){
      int i;
      for (i=0; i < length; i++) {
        if (array[offset + i] == 0)     break;
      }
      return new String(array,offset,i);
    }
}
