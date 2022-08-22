package com.example.project_59;

import android.content.Intent;
import android.view.View;
import android.view.animation.AnimationUtils;

import com.example.project_59.databinding.M001FlashActBinding;
import com.example.project_59.databinding.M001MainActBinding;

public class M001_Main_Act extends baseAct<M001MainActBinding>{

    public static final String NAME_ANIMAL = "NAME_ANIMAL";
    public static final String IMAGE_ANIMAL = "IMAGE_ANIMAL";
    private int drawableID ;
    private int contentZodiac ;
        private String name ;
    @Override
    protected void initViews() {
            binding.ivBird.setOnClickListener(v -> gotoContent(v, R.drawable.icon_bird,R.string.contentBird));
            binding.ivChecken.setOnClickListener(v -> gotoContent(v, R.drawable.icon_checken,R.string.contentChecken));
            binding.ivDog.setOnClickListener(v -> gotoContent(v, R.drawable.icon_dog,R.string.contentDog));
            binding.ivPenguin.setOnClickListener(v -> gotoContent(v, R.drawable.icon_penguin,R.string.contentPenguin));
            binding.btDetail.setOnClickListener(v -> gotoDetail());
    }

    private void gotoDetail() {
        Intent intent = new Intent();
        intent.setClass(this, M002_Detail_Act.class) ;
        intent.putExtra(NAME_ANIMAL,name) ;
        intent.putExtra(IMAGE_ANIMAL,drawableID);
        startActivity(intent);

    }

    private void gotoContent(View v, int drawable, int content) {
    v.startAnimation(AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_fade_in));
    drawableID = drawable;

    name = v.getContentDescription().toString() ;
    binding.btDetail.setEnabled(true);
    binding.tvContentAnimal.setText(content);

    }

    @Override
    protected M001MainActBinding initViewBinding() {
        return M001MainActBinding.inflate(getLayoutInflater());
    }
}
