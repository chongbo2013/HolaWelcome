package com.ferris.welcome;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 高仿Hola桌面启动欢迎页面动画
 * ferris
 * 459821731@qq.com
 * www.github.com/xufeifandj
 * http://blog.csdn.net/xufeifandj
 */
public class WelcomeActivity extends Activity {

   //壁纸逐渐放大
   private View getting_start_bg;
    //LOGO 渐变并且旋转出来
    private ImageView getting_start_logo,getting_start_name;
    private TextView getting_start_slogan,getting_start_btn,getting_start_tos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initViews();
    }

    private void initViews() {
        getting_start_bg=findViewById(R.id.getting_start_bg);
        getting_start_logo=(ImageView)findViewById(R.id.getting_start_logo);
        getting_start_name=(ImageView)findViewById(R.id.getting_start_name);
        getting_start_slogan=(TextView)findViewById(R.id.getting_start_slogan);
        getting_start_btn=(TextView)findViewById(R.id.getting_start_btn);
        getting_start_tos=(TextView)findViewById(R.id.getting_start_tos);
        getting_start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WelcomeActivity.this,"Go Launcher",Toast.LENGTH_LONG).show();
            }
        });
        startAimation();
        AlphaAnimationGo();
        showGetting_start_tos();
    }

    public  void startAimation() {
        //壁纸缩放动画
        ScaleAnimation localScaleAnimation = new ScaleAnimation(1.0F, 1.1F, 1.0F, 1.1F, 1, 0.5F, 1, 0.3973958F);
        localScaleAnimation.setDuration(2000L);
        localScaleAnimation.setFillAfter(true);
        getting_start_bg.startAnimation(localScaleAnimation);

        AnimationSet localAnimationSet = new AnimationSet(true);
        AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
        localAlphaAnimation.setStartOffset(1200L);
        localAlphaAnimation.setDuration(1800L);
        localAlphaAnimation.setFillAfter(true);
        localAnimationSet.addAnimation(localAlphaAnimation);
        RotateAnimation localRotateAnimation = new RotateAnimation(0.0F, 60.0F, 1, 0.5F, 1, 0.5F);
        localRotateAnimation.setStartOffset(1800L);
        localRotateAnimation.setDuration(1200L);
        localRotateAnimation.setFillAfter(true);
        localAnimationSet.addAnimation(localRotateAnimation);
        localAnimationSet.setFillAfter(true);
        getting_start_logo.startAnimation(localAnimationSet);


        AlphaAnimation getting_start_nameAnimation = new AlphaAnimation(0.0F, 1.0F);
        getting_start_nameAnimation.setStartOffset(1600L);
        getting_start_nameAnimation.setDuration(1800L);
        getting_start_nameAnimation.setFillAfter(true);
        getting_start_name.startAnimation(getting_start_nameAnimation);



        AlphaAnimation getting_start_sloganAnimation = new AlphaAnimation(0.0F, 1.0F);
        getting_start_sloganAnimation.setStartOffset(2400L);
        getting_start_sloganAnimation.setDuration(1600L);
        getting_start_sloganAnimation.setFillAfter(true);
        getting_start_slogan.startAnimation(getting_start_sloganAnimation);

    }

    private void AlphaAnimationGo()
    {
        AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
        localAlphaAnimation.setStartOffset(3600L);
        localAlphaAnimation.setDuration(1200L);
        localAlphaAnimation.setFillAfter(true);
        localAlphaAnimation.setAnimationListener(new Animation.AnimationListener()
        {
            public void onAnimationEnd(Animation paramAnimation)
            {
                getting_start_btn.setEnabled(true);
                getting_start_btn.setClickable(true);

            }

            public void onAnimationRepeat(Animation paramAnimation)
            {
            }

            public void onAnimationStart(Animation paramAnimation)
            {
            }
        });
        getting_start_btn.setEnabled(false);
        getting_start_btn.startAnimation(localAlphaAnimation);
    }

    private void showGetting_start_tos()
    {
        AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
        localAlphaAnimation.setStartOffset(3800L);
        localAlphaAnimation.setDuration(1600L);
        localAlphaAnimation.setFillAfter(true);
        getting_start_tos.startAnimation(localAlphaAnimation);
    }
}
