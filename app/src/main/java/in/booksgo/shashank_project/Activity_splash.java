package in.booksgo.shashank_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Objects;

public class Activity_splash extends AppCompatActivity {
    Handler handler;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        img = findViewById(R.id.logo);
        
        //For splash screen
        handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run (){
                        Intent intent = new Intent(Activity_splash.this, Activity_login.class);
                        startActivity(intent);
                        finish();
                    }

        },3000);
    }
}