package all;

public class ClonePair4397 {

    String method1(String[] args,String prefix){
      for (int i=0; i < args.length; i++)   if (args[i].equals(prefix)) {
        return args[i + 1];
      }
      return null;
    }

    String method2(String[] args,String fieldId){
      for (int i=0; i < args.length; i++) {
        if (args[i].equals(fieldId)) {
          String fieldValue=args[i + 1];
          return fieldValue;
        }
      }
      return null;
    }
}
