package all;

public class ClonePair12824 {

    String method1(String[] array,int posicao){
      if (array.length > posicao) {
        return array[posicao];
      }
     else {
        return "";
      }
    }

    String method2(String[] values,int index){
      String returnValue="";
      if (values.length > index) {
        returnValue=values[index];
      }
      return returnValue;
    }
}
