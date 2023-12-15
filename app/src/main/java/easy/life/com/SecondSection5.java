package easy.life.com;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class SecondSection5 extends AppCompatActivity {
    private Toolbar toolbar;

                    Dialog rateUsDiolog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_section5);





        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        toolbar = findViewById(R.id.myToolBar1);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView tv7 = findViewById(R.id.textView7);

        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ThirdSection.class);
                ca.putExtra("keyStory", "5/1");
                startActivity(ca);
            }
        });
        TextView tv8 = findViewById(R.id.textView8);

        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ThirdSection.class);
                ca.putExtra("keyStory", "5/2");
                startActivity(ca);

                rateUsDiolog = new RateUsDiolog(SecondSection5.this);
                rateUsDiolog.setContentView(R.layout.rate_us_dialog_layout2);
                rateUsDiolog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
                rateUsDiolog.setCancelable(false);
                rateUsDiolog.show();

            }
        });
    }
}
