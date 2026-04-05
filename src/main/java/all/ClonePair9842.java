package all;

public class ClonePair9842 {

    String[] method1(String[] args,int offset){
      if (offset >= args.length) {
        return new String[]{};
      }
      String[] ret=new String[args.length - offset];
      System.arraycopy(args,offset,ret,0,ret.length);
      return ret;
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
