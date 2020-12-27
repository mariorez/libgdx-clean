import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class HelloWorld extends Game {

    private SpriteBatch batch;
    private Texture texture;

    public void create() {
        batch = new SpriteBatch();
        FileHandle worldFile = Gdx.files.internal("assets/world.png");
        texture = new Texture(worldFile);
    }

    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        batch.draw(texture, 192, 112);
        batch.end();
    }
}
