package all;

public class ClonePair8070 {

    @SuppressWarnings("empty-statement") String method1(byte[] block,int offset,int length){
      int eos;
      for (eos=0; (eos < length) && (block[eos + offset] != 0x00); eos++)   ;
      return new String(block,offset,eos);
    }

    String method2(byte[] array,int offset,int length){
      int i;
      for (i=0; i < length; i++) {
        if (array[offset + i] == 0)     break;
      }
      return new String(array,offset,i);
    }
}
