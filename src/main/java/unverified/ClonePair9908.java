package unverified;

public class ClonePair9908 {

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
