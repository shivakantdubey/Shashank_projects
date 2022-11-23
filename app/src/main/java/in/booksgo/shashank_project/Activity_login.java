package in.booksgo.shashank_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Activity_login extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        toolbar = findViewById(R.id.toolbar);

        //step 1
        setSupportActionBar(toolbar);

        //step 2
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("E-Learning");
        }

        toolbar.setTitle("E-Learning");
        toolbar.setSubtitle("JetHat");

        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);
        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    //correct
                    Toast.makeText(Activity_login.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(Activity_login.this, Activity_signup.class);
                    startActivity(intent);

                }else
                    //incorrect
                    Toast.makeText(Activity_login.this, "LOGIN FAILED !", Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.opt_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemid = item.getItemId();
        if (itemid==R.id.opt_categories){
            Toast.makeText(this, "Fashion", Toast.LENGTH_SHORT).show();
        }else if (itemid==R.id.opt_open) {
            Toast.makeText(this, "Order Details", Toast.LENGTH_SHORT).show();
        }else if (itemid==android.R.id.home) {
            super.onBackPressed();
        }else {
            Toast.makeText(this, "Save Item", Toast.LENGTH_SHORT).show();
        }


        return super.onOptionsItemSelected(item);
    }
}