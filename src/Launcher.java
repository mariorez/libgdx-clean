import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Launcher {

    public static void main(String[] args) {
        LwjglApplicationConfiguration configuration = new LwjglApplicationConfiguration();
        configuration.title = "LibGDX Clean";
        configuration.width = 800;
        configuration.height = 600;
        //new LwjglApplication(new StarfishCollectorAlpha(), configuration);
        new LwjglApplication(new StarfishCollectorBeta(), configuration);
    }
}
