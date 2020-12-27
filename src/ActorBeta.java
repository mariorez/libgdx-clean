import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Extend the Actor class to include graphics and collision detection.
 * Actor class stores data such as position and rotation.
 */
public class ActorBeta extends Actor {

    private TextureRegion textureRegion;
    private Rectangle rectangle;

    public ActorBeta() {
        super();
        textureRegion = new TextureRegion();
        rectangle = new Rectangle();
    }

    public void setTexture(Texture texture) {
        textureRegion.setRegion(texture);
        this.setSize(texture.getWidth(), texture.getHeight());
        rectangle.setSize(texture.getWidth(), texture.getHeight());
    }

    public Rectangle getRectangle() {
        rectangle.setPosition(this.getX(), this.getY());
        return rectangle;
    }

    public boolean overlaps(ActorBeta other) {
        return this.getRectangle().overlaps(other.getRectangle());
    }

    public void act(float deltaTime) {
        super.act(deltaTime);
    }

    public void draw(Batch batch, float parentAlpha) {

        super.draw(batch, parentAlpha);

        Color color = getColor(); // used to apply tint color effect

        batch.setColor(color.r, color.g, color.b, color.a);

        if (isVisible())
            batch.draw(textureRegion,
                    getX(), getY(), getOriginX(), getOriginY(),
                    getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
    }
}
