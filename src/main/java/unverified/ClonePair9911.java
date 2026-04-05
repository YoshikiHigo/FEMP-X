package unverified;

public class ClonePair9911 {

    String[] method1(String[] args,int pos){
      String result[]=new String[args.length - pos];
      for (int i=pos; i < args.length; i++)   result[i - pos]=args[i];
      return result;
    }

    String[] method2(String[] files,int i){
      String[] result=new String[files.length - i];
      int j=0;
      while (i < files.length)   result[j++]=files[i++];
      return result;
    }
}
