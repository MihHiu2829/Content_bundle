package com.example.project_59;

import android.content.Intent;

import com.example.project_59.databinding.M002DetailActBinding;

public class M002_Detail_Act extends baseAct<M002DetailActBinding> {
    @Override
    protected void initViews() {
        Intent intent = getIntent() ;
        if (intent == null) return ;
        String name = intent.getStringExtra(M001_Main_Act.NAME_ANIMAL) ;
        int drawableID = intent.getIntExtra(M001_Main_Act.IMAGE_ANIMAL,-1);

        binding.tvNameAnimal.setText(name);
        binding.ivImageAnimal.setImageResource(drawableID);
    }

    @Override
    protected M002DetailActBinding initViewBinding() {
        return M002DetailActBinding.inflate(getLayoutInflater());
    }
}
