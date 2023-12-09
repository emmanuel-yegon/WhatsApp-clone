package com.emmanuel_yegon.ETchat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.emmanuel_yegon.ETchat.databinding.ActivityMainBinding;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mAuth = FirebaseAuth.getInstance();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.settings) {
            Toast.makeText(this, "Settings is clicked", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.groupChat) {
            Toast.makeText(this, "Start a group chat", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.logout) {
            mAuth.signOut();
            Intent intent = new Intent(MainActivity.this, SignInActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}


//        switch (item.getItemId())
//        {
//            case  R.id.settings:
//                Toast.makeText(this,"Settings is clicked",Toast.LENGTH_SHORT).show();
//                break;
//
//            case  R.id.groupChat:
//                Toast.makeText(this,"Start a group chat",Toast.LENGTH_SHORT).show();
//                break;
//
//            case  R.id.logout:
//                Toast.makeText(this,"Logout",Toast.LENGTH_SHORT).show();
//                break;
//
//        }