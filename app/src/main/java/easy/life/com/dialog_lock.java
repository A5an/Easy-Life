package easy.life.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;

public class dialog_lock extends AppCompatActivity {
              Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_lock);
        final AppCompatButton laterBtn = findViewById(R.id.laterBtn);
        final AppCompatButton  rateNowBtn  = findViewById(R.id.rateNowBtn);

        rateNowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ca = new Intent(getApplicationContext(), SecondSection2.class);
                startActivity(ca); 
            }
        });



        laterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });



    }
   /* public  void show(){
        Button yes = findViewById(R.id.rateNowBtn);
        Button no  = findViewById(R.id.laterBtn);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ca = new Intent(getApplicationContext(), SecondSection2.class);
                startActivity(ca);
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }     */
}
