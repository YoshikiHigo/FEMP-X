package all;

public class ClonePair9914 {

    String[] method1(String[] originalArgs,int stripCount){
      if (originalArgs.length <= stripCount) {
        return new String[0];
      }
      String[] stripped=new String[originalArgs.length - stripCount];
      for (int i=0; i < stripped.length; i++) {
        stripped[i]=originalArgs[i + stripCount];
      }
      return stripped;
    }

    String[] method2(String[] args,int n){
      if (args.length <= n) {
        return new String[0];
      }
      String[] argv=new String[args.length - n];
      System.arraycopy(args,n,argv,0,argv.length);
      return argv;
    }
}
