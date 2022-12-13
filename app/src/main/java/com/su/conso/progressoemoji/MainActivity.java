package com.su.conso.progressoemoji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekBar;
    private ImageView imageView;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imgEmojin);
        seekBar = findViewById(R.id.seekBar);
        textView = findViewById(R.id.textView2);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            int i = seekBar.getProgress();

            if (i <= 2){
                imageView.setImageResource(R.drawable.triste);
            }else if (i >= 3 && i <= 4){
                imageView.setImageResource(R.drawable.quase_triste);
            }else if (i >= 5 && i <= 7){
                imageView.setImageResource(R.drawable.quse_felix);
            }else if (i >= 8 && i <= 10){
                imageView.setImageResource(R.drawable.coracao);
            }
            textView.setText(i+"/10");
        }
    });
    }
}