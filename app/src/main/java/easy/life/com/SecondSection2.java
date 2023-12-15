package easy.life.com;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondSection2 extends AppCompatActivity {
    private Toolbar toolbar;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_section2);
        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        toolbar = findViewById(R.id.myToolBar1);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);






          //ye;yj
         /*   dialog = new Dialog(this);
            dialog.setContentView(R.layout.lockpls);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.setCancelable(false);
            dialog.show();    */
       
            // ye;yj










        TextView tv2 = findViewById(R.id.textView2);

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ThirdSection.class);
                ca.putExtra("keyStory", "2/1");
                startActivity(ca);
            }
        });
        TextView tv3 = findViewById(R.id.textView3);

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ThirdSection.class);
                ca.putExtra("keyStory", "2/2");
                startActivity(ca);
            }
        });
        TextView tv4 = findViewById(R.id.textView4);

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ThirdSection.class);
                ca.putExtra("keyStory", "2/3");
                startActivity(ca);
            }
        });
        TextView tv5 = findViewById(R.id.textView5);

        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ThirdSection.class);
                ca.putExtra("keyStory", "2/4");
                startActivity(ca);
            }
        });
        TextView tv6 = findViewById(R.id.textView6);

        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ThirdSection.class);
                ca.putExtra("keyStory", "2/5");
                startActivity(ca);
            }
        });
    }
      
}
