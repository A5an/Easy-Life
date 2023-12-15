package easy.life.com;



import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RatingBar;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

public class RateUsDiolog extends Dialog {
    private float userRate = 0;


    public RateUsDiolog(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.rate_us_dialog_layout);




        final AppCompatButton laterBtn = findViewById(R.id.laterBtn);
        final AppCompatButton  rateNowBtn  = findViewById(R.id.rateNowBtn);
        final RatingBar ratingBar = findViewById(R.id.ratingBar);
        final ImageView ratingImage = findViewById(R.id.ratingImage);

        rateNowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("market://details?id=easy.life.com");
            }
        });



        laterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (rating <= 1){
                    ratingImage.setImageResource(R.drawable.onestar);
                }
                else if (rating <= 2){
                    ratingImage.setImageResource(R.drawable.two);
                }
                else if (rating <= 3){
                    ratingImage.setImageResource(R.drawable.three);
                }
                else if (rating <= 4){
                    ratingImage.setImageResource(R.drawable.four);
                }
                else if (rating <= 5){
                    ratingImage.setImageResource(R.drawable.five);
                }
                animatedImage(ratingImage);

                userRate = rating;
            }

        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
      getContext().startActivity(i);
    }




    private void animatedImage (ImageView ratingImage) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0, 1f, 0, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setDuration(200);
        ratingImage.startAnimation(scaleAnimation);

    }

}
