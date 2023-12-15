package easy.life.com;

import static java.security.AccessController.getContext;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;


public class MainActivity extends AppCompatActivity {

    ReviewManager manager;
    ReviewInfo reviewInfo;
    Toolbar toolbar;
    int i =0;
     private  boolean isBackPressedOnce = false;
      Dialog dialog;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    private static final String SHARED_PREF_NAME = "MyPref";
    Switch switcher;
    boolean nightMODE;
    boolean baba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
        editor = sharedPreferences.edit();
        sharedPreferences = getSharedPreferences("MODE", Context.MODE_PRIVATE);
        nightMODE = sharedPreferences.getBoolean("night", false);

        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        boolean firstStart = prefs.getBoolean("firstStart", true);



       

        if (nightMODE){

            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            editor = sharedPreferences.edit();
            editor.putBoolean("night", true);


        }
        else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

            editor = sharedPreferences.edit();
            editor.putBoolean("night", false);

        }
        editor.apply();

        



        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        boolean first = pref.getBoolean("first", true);

        RateUsDiolog2 rateUsDiolog2 = new RateUsDiolog2(MainActivity.this);
        rateUsDiolog2.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
        rateUsDiolog2.setCancelable(false);

        if (first){
            rateUsDiolog2.show();
           //dialod();
        }

        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        // без ночного режима

        //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);


        toolbar = findViewById(R.id.myToolBar1);
        setSupportActionBar(toolbar);


        TextView tv2 = findViewById(R.id.textView2);

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               

                Intent ca = new Intent(getApplicationContext(), SecondSection.class);

                startActivity(ca);

            }
        });
        TextView textView3 = findViewById(R.id.textView3);

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                



                        



                    Intent ca = new Intent(getApplicationContext(), SecondSection2.class);
                    startActivity(ca);




            }
        });
        TextView textView4 = findViewById(R.id.textView4);

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), SecondSection3.class);

                startActivity(ca);
            }
        });
        TextView textView5 = findViewById(R.id.textView5);

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), SecondSection4.class);

                startActivity(ca);
            }
        });
        TextView textView6 = findViewById(R.id.textView6);

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), SecondSection5.class);

                startActivity(ca);
            }
        });
        TextView textView7 = findViewById(R.id.textView7);

        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), SecondSection6.class);

                startActivity(ca);
            }
        });
        TextView textView8 = findViewById(R.id.textView8);

        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), SecondSection7.class);

                startActivity(ca);
            }
        });
        TextView textView9 = findViewById(R.id.textView9);

        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), SecondSection8.class);

                startActivity(ca);
            }
        });
        TextView textView10 = findViewById(R.id.textView10);

        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), SecondSection9.class);

                startActivity(ca);
            }
        });
        TextView textView11 = findViewById(R.id.textView11);

        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), SecondSection10.class);

                startActivity(ca);
            }
        });
        TextView textView12 = findViewById(R.id.textView12);

        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), SecondSection11.class);

                startActivity(ca);
            }
        });
        TextView textView13 = findViewById(R.id.textView13);

        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ThirdSection.class);
                ca.putExtra("keyStory", "12");
                startActivity(ca);


            }
        });





    }

    public void showDialog() {
          dialog = new Dialog(this);
         dialog.setContentView(R.layout.rate_us_dialog_layout3);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
        dialog.setCancelable(false);
         dialog.show();
      /*  Button yes = findViewById(R.id.rateNowBtn);
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
        });         */

    }


    public void onBackPressed(){
        if (isBackPressedOnce){
            super.onBackPressed();
            return;

        }

        Toast.makeText(this, "Нажмите еще раз чтобы выйти", Toast.LENGTH_SHORT).show();
       isBackPressedOnce = true;

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               isBackPressedOnce = false;
           }

       }, 2000); 
    }

    private void dialod(){
        new AlertDialog.Builder(this)
                .setTitle("Прочитайте пожалуйста!")
                .setMessage("В верху приложения есть значок текста. Нажмите на него перед началом. Спасибо!")
                .setPositiveButton("Окей", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }) .create().show();
                 SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                 SharedPreferences.Editor editor = pref.edit();
                 editor.putBoolean("first", false);
                 editor.apply();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.set: {
                Intent c = new Intent(getApplicationContext(), Settings.class);
                startActivity(c);
            }
        }
        switch (item.getItemId()) {
            case R.id.dialog: {
                RateUsDiolog2 rateUsDiolog = new RateUsDiolog2(MainActivity.this);
                rateUsDiolog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
                rateUsDiolog.setCancelable(false);
                rateUsDiolog.show();
            }
        }

        switch (item.getItemId()) {
            case R.id.star: {
                RateUsDiolog rateUsDiolog = new RateUsDiolog(MainActivity.this);
                rateUsDiolog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
                rateUsDiolog.setCancelable(false);
                rateUsDiolog.show();
            }
        }

        return super.onOptionsItemSelected(item);

    }
    private void showStartDialog() {
        new AlertDialog.Builder(this)
                .setTitle("ldsfj")
                .setMessage("asl;fj")
                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create().show();
        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("firstStart", false);
        editor.apply();

    }
   

}
