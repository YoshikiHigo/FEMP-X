package all;

public class ClonePair9813 {

    String[] method1(String[] array,int length){
      String[] newArray=new String[length];
      for (int i=0; i < length; i++) {
        newArray[i]=array[i];
      }
      return newArray;
    }

    String[] method2(String[] array,int count){
      String[] retval=new String[count];
      for (int iii=0; iii < count; iii++)   retval[iii]=array[iii];
      return retval;
    }
}
