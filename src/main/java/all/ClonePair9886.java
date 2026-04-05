package all;

public class ClonePair9886 {

    String[] method1(String[] lines,int amountToRemove){
      String[] result=new String[lines.length - amountToRemove];
      for (int i=0; i < result.length; i++) {
        result[i]=lines[i + amountToRemove];
      }
      return result;
    }

    String[] method2(String[] args,int pos){
      String result[]=new String[args.length - pos];
      for (int i=pos; i < args.length; i++)   result[i - pos]=args[i];
      return result;
    }
}
