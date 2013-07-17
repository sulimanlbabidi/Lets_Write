package com.sl.letswrite;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.app.Activity;
import android.content.Intent;

public class SplashActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Animation fade = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        final LinearLayout lay = (LinearLayout) findViewById (R.id.main);
        lay.setAnimation(fade);
        lay.startLayoutAnimation();
        fade.setAnimationListener(new AnimationListener() {
        	@Override
        	public void onAnimationEnd(Animation animation)
        	{
        		lay.setBackgroundColor(getResources().getColor(R.color.white));
        		SplashActivity.this.finish();
        		startActivity(new Intent(SplashActivity.this,MenuActivity.class));
        		
        	}

			@Override
			public void onAnimationRepeat(Animation arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onAnimationStart(Animation arg0) {
				// TODO Auto-generated method stub
				
			}
        });
    }

    
}
