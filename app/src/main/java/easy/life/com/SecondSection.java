package easy.life.com;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class SecondSection extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_section);
        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        toolbar = findViewById(R.id.myToolBar1);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);



        TextView tv2 = findViewById(R.id.textView2);

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ThirdSection.class);
                 ca.putExtra("keyStory", "1/1");
                startActivity(ca);
            }
        });
        TextView tv3 = findViewById(R.id.textView3);

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ThirdSection.class);
                ca.putExtra("keyStory", "1/2");
                startActivity(ca);
            }
        });
        TextView tv4 = findViewById(R.id.textView4);

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ThirdSection.class);
                ca.putExtra("keyStory", "1/3");
                startActivity(ca);
            }
        });
        TextView tv5 = findViewById(R.id.textView5);

        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ThirdSection.class);
                ca.putExtra("keyStory", "1/4");
                startActivity(ca);
            }
        });
        TextView tv6 = findViewById(R.id.textView6);

        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ThirdSection.class);
                ca.putExtra("keyStory", "1/5");
                startActivity(ca);
            }
        });
    }
}