package inequivalent;

public class ClonePair13197 {

    String[] method1(String path) {
        path = path.replaceFirst("^/+", "");
        String ctrlName = null;
        String actionName = null;
        if (path.length() > 0) {
            int divider = path.lastIndexOf("/");
            if (divider == -1) {
                ctrlName = path;
            } else {
                ctrlName = path.substring(0, divider).trim();
                if (divider + 1 < path.length()) {
                    actionName = path.substring(divider + 1).trim();
                }
            }
        }
        return new String[]{ctrlName, actionName};
    }

    String[] method2(String hname) {
        String[] ans = new String[2];
        int n = hname.lastIndexOf('.');
        if (n < 0) {
            ans[0] = "";
            ans[1] = hname;
        } else {
            ans[0] = hname.substring(0, n);
            ans[1] = n < hname.length() - 1 ? hname.substring(n + 1) : "";
        }
        return ans;
    }
}
