package com.micropop.cookbook;

import android.app.ActionBar;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;


public class PannekakerActivity extends AppCompatActivity {
    private float mActionBarHeight;
    private ActionBar mActionBar;
    private static final String EXTRA_TITLE = "com.micropop.cookbook.extraTitle";
    private static final String EXTRA_IMAGE = "com.micropop.cookbook.extraImage";
    private static final String EXTRA_DO = "com.micropop.cookbook.extraDo";
    private static final String EXTRA_NEED = "com.micropop.cookbook.extraNeed";
public TextView Needz;
    public TextView Dooz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_d);
        String itemTitle = getIntent().getStringExtra(EXTRA_TITLE);
        String itemNeed = getIntent().getStringExtra(EXTRA_NEED);
        String itemDo = getIntent().getStringExtra(EXTRA_DO);
        Dooz = (TextView) findViewById(R.id.yoDoThis);
        Needz = (TextView) findViewById(R.id.yoNeedThis);
        Dooz.setText(itemDo);
        Needz.setText(itemNeed);
        Bundle extras = getIntent().getExtras();
        if (extras == null)
        {
            return;
        }
        int res = extras.getInt("resourseInt");
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle(itemTitle);
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(R.color.transparentcolor));
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        final ImageView image = (ImageView) findViewById(R.id.imagennn);
image.setImageResource(res);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pannekaker, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
