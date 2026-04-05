package all;

public class ClonePair9885 {

    String[] method1(String[] in,int skip){
      String[] tmp=new String[in.length + -1];
      int j=0;
      for (int i=0; i < in.length; i++) {
        if (i != skip) {
          tmp[j++]=in[i];
        }
      }
      return tmp;
    }

    String[] method2(String[] fromArray,int index){
      String[] result=new String[fromArray.length - 1];
      int to, from;
      for (to=0, from=0; from < fromArray.length; from++)   if (from != index) {
        result[to]=fromArray[from];
        to++;
      }
      ;
      return result;
    }
}
