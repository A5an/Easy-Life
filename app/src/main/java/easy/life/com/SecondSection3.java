package easy.life.com;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class SecondSection3 extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_section3);
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
                ca.putExtra("keyStory", "3/1");
                startActivity(ca);
            }
        });
        TextView tv8 = findViewById(R.id.textView8);

        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ThirdSection.class);
                ca.putExtra("keyStory", "3/2");
                startActivity(ca);
            }
        });
        TextView tv9 = findViewById(R.id.textView9);

        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ThirdSection.class);
                ca.putExtra("keyStory", "3/3");
                startActivity(ca);
            }
        });


        TextView tv2 = findViewById(R.id.textView2);

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ThirdSection.class);
                ca.putExtra("keyStory", "3/4");
                startActivity(ca);
            }
        });
        TextView tv3 = findViewById(R.id.textView3);

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ThirdSection.class);
                ca.putExtra("keyStory", "3/5");
                startActivity(ca);
            }
        });
        TextView tv4 = findViewById(R.id.textView4);

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ThirdSection.class);
                ca.putExtra("keyStory", "3/6");
                startActivity(ca);
            }
        });
        TextView tv5 = findViewById(R.id.textView5);

        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ThirdSection.class);
                ca.putExtra("keyStory", "3/7");
                startActivity(ca);
            }
        });
        TextView tv6 = findViewById(R.id.textView6);

        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ThirdSection.class);
                ca.putExtra("keyStory", "3/8");
                startActivity(ca);
            }
        });
    }
}