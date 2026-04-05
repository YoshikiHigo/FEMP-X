package all;

public class ClonePair9841 {

    String[] method1(String[] args,int offset){
      if (offset >= args.length) {
        return new String[]{};
      }
      String[] ret=new String[args.length - offset];
      System.arraycopy(args,offset,ret,0,ret.length);
      return ret;
    }

    String[] method2(String[] originalArgs,int stripCount){
      if (originalArgs.length <= stripCount) {
        return new String[0];
      }
      String[] stripped=new String[originalArgs.length - stripCount];
      for (int i=0; i < stripped.length; i++) {
        stripped[i]=originalArgs[i + stripCount];
      }
      return stripped;
    }
}
