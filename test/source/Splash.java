package source;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import scene2d.Scene;

public class Splash extends Scene {

	public Splash() {
		splashDuration = 5f; // This will make my splash scene to wait 5 seconds
								// after assets are all loaded
		final Texture bg1 = new Texture("splash/libgdx.png");
		final Image imgbg1 = new Image(bg1);
		imgbg1.setFillParent(true);
		addActor(imgbg1);
	}

	@Override
	public void onClick(Actor actor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTouchDown(Actor actor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTouchUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDragged() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onGesture(GestureType gestureType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onKeyTyped(char key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onKeyUp(int keycode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onKeyDown(int keycode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDispose() {
		// TODO Auto-generated method stub
		
	}
}