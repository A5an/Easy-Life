package easy.life.com;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class Settings extends AppCompat {
    Switch switcher;
    boolean nightMODE;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    private Toolbar toolbar;
    int istap = 0;
    private static final String SHARED_PREF_NAME = "MyPref";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        AppCompatButton ru = findViewById(R.id.ru);
        AppCompatButton en = findViewById(R.id.eng);

        LanguageManager lang = new LanguageManager(this);
         ru.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editor.putBoolean("baba", true);
                editor.commit();
                    lang.updateResource("ru");
                 startActivity(getIntent());
                 finish();
                 overridePendingTransition(0, 0);
             }
         });
         en.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 editor.putBoolean("baba", false);
                 editor.commit();
                 lang.updateResource("en");
                 startActivity(getIntent());
                 finish();
                 overridePendingTransition(0, 0);
             }
         });

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
        editor = sharedPreferences.edit();




        switcher = findViewById(R.id.sw);
        sharedPreferences = getSharedPreferences("MODE", Context.MODE_PRIVATE);
        nightMODE = sharedPreferences.getBoolean("night", false);

        if (nightMODE){
            switcher.setChecked(true);
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }


        switcher.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SuspiciousIndentation")
            @Override
            public void onClick(View view) {
                if (nightMODE){

                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

                    editor = sharedPreferences.edit();
                    editor.putBoolean("night", false);

                }
                else {
                 AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

                    editor = sharedPreferences.edit();
                    editor.putBoolean("night", true);
                }
                editor.apply();
            }
        });




        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        toolbar = findViewById(R.id.myToolBar1);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

      /*  spinner = findViewById(R.id.spin);
        txtChangeFont = findViewById(R.id.txt);
        seekbar = findViewById(R.id.seekbar);
        txtFontSize = findViewById(R.id.fontsize); */


     /*   changeFontFamily();
        changeFontSize();

    }

    private void changeFontSize() {
        int intFontSize = sharedPreferences.getInt(KEY_FONT_SIZE, 0);
        if (intFontSize !=0){
            txtFontSize.setText(String.valueOf(intFontSize));
            txtChangeFont.setTextSize(intFontSize);
            seekbar.setProgress(intFontSize);
        }


        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int position, boolean b) {
                txtFontSize.setText(String.valueOf(position));
                txtChangeFont.setTextSize(position);
                editor.putInt(KEY_FONT_SIZE,position);
                editor.apply();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void changeFontFamily(){
        final String [] fontlist=new String []{"Выбор шрифта","abril fatface", "alegreya black italic", "b612 mono bold", "cambay bold", "athiti bold"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(Settings.this, android.R.layout.simple_spinner_item, fontlist);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 1){
                    txtChangeFont.setTypeface(ResourcesCompat.getFont(Settings.this, R.font.abril_fatface));
                    editor = sharedPreferences.edit();
                    editor.putInt(KEY_FONT_FAMILY, position);
                }
                else if (position == 2){
                    txtChangeFont.setTypeface(ResourcesCompat.getFont(Settings.this, R.font.alegreya_black_italic));
                    editor = sharedPreferences.edit();
                    editor.putInt(KEY_FONT_FAMILY, position);
                }
                else if (position == 3){
                    txtChangeFont.setTypeface(ResourcesCompat.getFont(Settings.this, R.font.b612_mono_bold));
                    editor = sharedPreferences.edit();
                    editor.putInt(KEY_FONT_FAMILY, position);
                }
                else if (position == 4){
                    txtChangeFont.setTypeface(ResourcesCompat.getFont(Settings.this, R.font.cambay_bold));
                    editor = sharedPreferences.edit();
                    editor.putInt(KEY_FONT_FAMILY, position);
                }
                else if (position == 5){
                    txtChangeFont.setTypeface(ResourcesCompat.getFont(Settings.this, R.font.athiti_bold));
                    editor = sharedPreferences.edit();
                    editor.putInt(KEY_FONT_FAMILY, position);
                }
                editor.apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });  */


    }


}
