package com.permission.helper.app;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.permission.helper.app.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityMainBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);

        binding.btnPermisson.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view== binding.btnPermisson)
        {
           /*
        Ask for Runtime Permission using Library
         */
            PermissionsUtil.askPermission(MainActivity.this, PermissionsUtil.STORAGE, new PermissionsUtil.PermissionListener() {
                @Override
                public void onPermissionResult(boolean isGranted) {
                    if (isGranted) {
                        //Write code that required Runtime Permission
                    }
                }
            });
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        PermissionsUtil.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}
