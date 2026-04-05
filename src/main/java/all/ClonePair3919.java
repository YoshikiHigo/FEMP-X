package all;

public class ClonePair3919 {

    byte[] method1(byte[] result,byte[] fill,int position){
      for (int i=position; i < position + fill.length; i++) {
        result[i]=fill[i - position];
      }
      return result;
    }

    byte[] method2(byte[] b1,byte[] b2,int position){
      for (int i=0; i < b2.length; i++) {
        b1[position + i]=b2[i];
      }
      return b1;
    }
}
