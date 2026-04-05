package all;

public class ClonePair3798 {

    String[] method1(String[] array1,String[] array2){
      if ((array1 == null || array1.length == 0)) {
        return array2;
      }
      if ((array2 == null || array2.length == 0)) {
        return array1;
      }
      String[] newArr=new String[array1.length + array2.length];
      System.arraycopy(array1,0,newArr,0,array1.length);
      System.arraycopy(array2,0,newArr,array1.length,array2.length);
      return newArr;
    }

    String[] method2(String[] first,String[] second){
      if (first == null || first.length == 0) {
        return second;
      }
      if (second == null || second.length == 0) {
        return first;
      }
      String[] result=new String[first.length + second.length];
      System.arraycopy(first,0,result,0,first.length);
      System.arraycopy(second,0,result,first.length,second.length);
      return result;
    }
}
