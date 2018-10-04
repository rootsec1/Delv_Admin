package io.github.abhishekwl.delv_admin.delv_admin.Activities;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.github.abhishekwl.delv_admin.R;

public class SplashActivity extends AppCompatActivity {

    @BindView(R.id.splashLogoImageView)
    ImageView splashLogoImageView;

    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) getWindow().setNavigationBarColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
        setContentView(R.layout.activity_splash);

        unbinder = ButterKnife.bind(SplashActivity.this);
        initializeComponents();
        initializeViews();
    }

    private void initializeComponents() {

    }

    private void initializeViews() {
        Glide.with(getApplicationContext()).load(R.drawable.price_tag).into(splashLogoImageView);
    }

    @Override
    protected void onDestroy() {
        unbinder.unbind();
        super.onDestroy();
    }
}
