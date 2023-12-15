package easy.life.com;



import static android.content.Context.MODE_PRIVATE;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;

public class RateUsDiolog2 extends Dialog {



    public RateUsDiolog2(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.rate_us_dialog_layout2);

         final TextView  tv = findViewById(R.id.mama)  ;
         String text = getContext().getString(R.string.begtext);
           tv.setText(text);
       
        final AppCompatButton rateNowBtn = findViewById(R.id.rateNowBtn);


        SharedPreferences pref = getContext().getSharedPreferences("pref", MODE_PRIVATE);
        boolean first = pref.getBoolean("first", true);
        SharedPreferences.Editor editor = pref.edit();

        rateNowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dismiss();

                editor.putBoolean("first", false);
                editor.apply();
            }
        });





    }
}
