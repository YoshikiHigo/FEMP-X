package all;

public class ClonePair9887 {

    String[] method1(String[] lines,int amountToRemove){
      String[] result=new String[lines.length - amountToRemove];
      for (int i=0; i < result.length; i++) {
        result[i]=lines[i + amountToRemove];
      }
      return result;
    }

    String[] method2(String[] files,int i){
      String[] result=new String[files.length - i];
      int j=0;
      while (i < files.length)   result[j++]=files[i++];
      return result;
    }
}
