package all;

public class ClonePair12508 {

    String method1(String name){
      String lowerName=name.toLowerCase();
      String[] pieces=lowerName.split("_");
      if (pieces.length == 1) {
        return lowerName;
      }
      StringBuffer result=new StringBuffer(pieces[0]);
      for (int i=1; i < pieces.length; i++) {
        result.append(Character.toUpperCase(pieces[i].charAt(0)));
        result.append(pieces[i].substring(1));
      }
      return result.toString();
    }

    String method2(String columnName){
      String[] textList=columnName.split("_");
      String name=textList[0].toLowerCase();
      int length=textList.length;
      for (int i=1; i < length; i++) {
        String text=textList[i];
        name=name + text.charAt(0) + text.substring(1,text.length()).toLowerCase();
      }
      return name;
    }
}
