package all;

public class ClonePair7894 {

    boolean method1(String name,String pwd){
      if (name == null || name.equals("") || pwd == null || pwd.equals("")) {
        return false;
      }
      return true;
    }

    boolean method2(String url,String dir){
      if (url == null || dir == null) {
        return false;
      }
      if (url.trim().length() == 0 || dir.trim().length() == 0) {
        return false;
      }
      return true;
    }
}
