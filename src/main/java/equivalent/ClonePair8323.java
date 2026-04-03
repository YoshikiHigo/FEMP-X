package equivalent;

public class ClonePair8323 {
    int method1(int heading) {
        if ((heading >= 0) && (heading <= 5)) return ((9 + heading) % 6);
        return 6;
    }

    int method2(int adj) {
        int ret = 6;
        switch (adj) {
            case 0:
                ret = 3;
                break;
            case 1:
                ret = 4;
                break;
            case 2:
                ret = 5;
                break;
            case 3:
                ret = 0;
                break;
            case 4:
                ret = 1;
                break;
            case 5:
                ret = 2;
                break;
        }
        return ret;
    }
}
