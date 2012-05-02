package pp.ppp.pppp;

/**
 * Created with IntelliJ IDEA.
 * User: Zakhar
 * Date: 02.05.12
 * Time: 15:16
 * To change this template use File | Settings | File Templates.
 */
public class Wcx {
    private static Wcx ourInstance = new Wcx();

    public static Wcx getInstance() {
        return ourInstance;
    }

    private Wcx() {
    }
}
