package com.example.project_59;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.project_59.databinding.M001FlashActBinding;

public class M001_Flash_Act extends baseAct<M001FlashActBinding> {



    @Override
    protected void initViews() {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    gotoMain();
                }
            },2000);
    }

    private void gotoMain() {
            Intent intent = new Intent();
            intent.setClass(this, M001_Main_Act.class) ;
            startActivity(intent);

            finish();
    }

    @Override
    protected M001FlashActBinding initViewBinding() {
        return M001FlashActBinding.inflate(getLayoutInflater());
    }
}