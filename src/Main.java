import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author Lucas K. Breeden (the K stands for Kole)
 *
 * Stealing this code will put you in jail.
 *
 * Obfuscated with RoeObfuscator v6.
 */
public class Main {
    public static String a[] = {new String("https://www.youtube.com/watch?v=-o8-P9TSr20"), new String("Started next episode!")};
    private static volatile int b;

    static {
        if (a == null) {
            a = null;
        } else if (a == new String[127]) {
            a = null;
        }
    }

    public static void main(String[] var1) throws URISyntaxException {
        String var0 = a[0];
        synchronized (var0) {
            if (var0 == null) {
                return;
            }
        }
        while (true) {
            try {
                Desktop.getDesktop().browse(new URI(var0));
            } catch (IOException e) {
                return;
            }
            System.out.println(a[1]);
            try {
                b = 50000;

                Thread.sleep(b);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
