package all;

public class ClonePair11934 {

    String method1(String ent,String proc,String strocar){
      String trocar;
      if (ent == null) {
        return null;
      }
      if (ent.equals("")) {
        return new String();
      }
      if ((proc == null) || (proc.equals(""))) {
        return new String(ent);
      }
      if (strocar == null) {
        trocar=new String();
      }
     else {
        trocar=strocar;
      }
      StringBuffer sb=new StringBuffer(ent);
      int fi=0;
      int larg=proc.length();
      int larg2=trocar.length();
      int local=sb.indexOf(proc,fi);
      while (local != -1) {
        sb.delete(local,local + larg);
        sb.insert(local,trocar);
        fi=local + larg2;
        local=sb.indexOf(proc,fi);
      }
      return sb.toString();
    }

    String method2(String input,String oldString,String newString){
      String result=input;
      if (input != null && oldString != null && !"".equals(oldString)) {
        int newPosition=input.indexOf(oldString);
        if (newPosition != -1) {
          final StringBuilder builder=new StringBuilder();
          builder.append(input.substring(0,newPosition));
          builder.append(newString == null ? "" : newString);
          int oldPosition=newPosition + oldString.length();
          while ((newPosition=input.indexOf(oldString,oldPosition)) != -1) {
            builder.append(input.substring(oldPosition,newPosition));
            builder.append(newString == null ? "" : newString);
            oldPosition=newPosition + oldString.length();
          }
          builder.append(input.substring(oldPosition,input.length()));
          result=builder.toString();
        }
      }
      return result;
    }
}
