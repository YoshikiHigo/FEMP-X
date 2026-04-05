package all;

public class ClonePair9906 {

    String[] method1(String[] src,int index){
      if (index < 0 && index >= src.length)   return src;
      String[] newArr=new String[src.length - 1];
      int minus=0;
      for (int i=0; i < src.length; i++) {
        if (i == index)     minus=1;
     else     newArr[i - minus]=src[i];
      }
      return newArr;
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
