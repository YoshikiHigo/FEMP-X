package all;

public class ClonePair9883 {

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

    String[] method2(String[] input,int skip){
      String[] result=new String[input.length - 1];
      for (int i=0; i < input.length; i++) {
        if (i == skip) {
          continue;
        }
        int p=i < skip ? i : i - 1;
        result[p]=input[i];
      }
      return result;
    }
}
