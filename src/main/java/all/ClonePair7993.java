package all;

public class ClonePair7993 {

    String method1(byte[] _b,int _o,int _l){
      int i;
      for (i=_o; i < _o + _l; i++)   if (_b[i] == 0)   break;
      return new String(_b,_o,i - _o);
    }

    @SuppressWarnings("empty-statement") String method2(byte[] block,int offset,int length){
      int eos;
      for (eos=0; (eos < length) && (block[eos + offset] != 0x00); eos++)   ;
      return new String(block,offset,eos);
    }
}
