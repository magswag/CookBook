package com.micropop.cookbook;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.preference.ListPreference;
import android.preference.PreferenceManager;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;

    String[] itemname ={
            "Pannekake",
            "Kokt potet",
            "Sjokoladefondant",
            "Testttttt",
            "Testttttt",
            "Testttttt",
            "Testttttt",
            "Testttttt",
            "Testttttt",
            "Testttttt",
            "Testttttt",
            "Testttttt",
            "Testttttt",

    };
    String[] descript ={
            "Middels",
            "Enkel",
            "Middels",
            "Testttt",
            "Tesssst",
            "Testttt",
            "Testttt",
            "Testttt",
            "Testttt",
            "Testttt",
            "Testttt",
            "Testttt",
            "Testttt"

    };
    Integer[] imgid={
            R.drawable.pannekaker,
            R.drawable.potato,
            R.drawable.fondant,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,

    };
    private static final String EXTRA_TITLE = "com.micropop.cookbook.extraTitle";
    private static final String EXTRA_NEED = "com.micropop.cookbook.extraNeed";
    private static final String EXTRA_DO = "com.micropop.cookbook.extraDo";
    private static final String EXTRA_IMAGE = "resourseInt";
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        String prefList = sharedPreferences.getString("PREF_THEME", "1");


        if (prefList.contentEquals("1")) {

            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary500)));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary700));
            }
        }else if (prefList.contentEquals("2")) {
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary500red)));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary700red));
            }
        }else if (prefList.contentEquals("3")) {

        }
        else if (prefList.contentEquals("4")) {

        }
        else if (prefList.contentEquals("5")) {

        }
        CustomListAdapter adapter=new CustomListAdapter(this, itemname, descript, imgid);
        list=(ListView)findViewById(R.id.listView);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
               switch (position) {
                   case 0:

                       Intent Pannek = new Intent(MainActivity.this, PannekakerActivity.class);
                       Pannek.putExtra(EXTRA_TITLE, itemname[position]);
                       Pannek.putExtra(EXTRA_IMAGE, imgid[position]);
                       Pannek.putExtra(EXTRA_NEED, "3 dl hvetemel\n" +
                               "1/2 ts salt\n" +
                               "5 dl melk\n" +
                               "4 egg\n" +
                               "2 ss flytende margarin til steking");
                       Pannek.putExtra(EXTRA_DO, "1. Bland sammen mel og salt. Tilsett halvparten av melken.\n" +
                               "2. Bruk en visp og rør godt, til ei tykk røre uten klumper.\n" +
                               "3. Tilsett resten av melken og rør til alt er jevnt.\n" +
                               "4. Visp inn eggene.\n" +
                               "5. La røra stå på benken for å svelle i ca. 15 minutter.\n" +
                               "6. Stek tynne pannekaker på nokså sterk varme. Snu pannekakene når de har stivnet på oversiden og har fått en fin og gyllen farge på undersiden. Stek dem gylne på den andre siden.");
                       startActivity(Pannek);
                       break;
                   case 1:
                       Intent Pott = new Intent(MainActivity.this, PannekakerActivity.class);
                       Pott.putExtra(EXTRA_TITLE, itemname[position]);
                       Pott.putExtra(EXTRA_IMAGE, imgid[position]);
                       Pott.putExtra(EXTRA_NEED, "4 store eller 8 små poteter\n" +
                               "1 l vann\n" +
                               "1/2 ts salt");
                       Pott.putExtra(EXTRA_DO, "1. Skyll potetene og skrell dem med en potetskreller. (Skrubb potetene med en potetbørste først hvis det er jord på dem.)\n" +
                               "2. Sett på vannet til koking.\n" +
                               "3. Ha i saltet og legg i potetene når vannet koker.\n" +
                               "4. Kok potetene til de er så møre at de \"slipper\" når du stikker i dem med en kniv eller en potetgaffel.\n" +
                               "5. Hell av kokevannet, bruk grytekluter og lokk.\n" +
                               "6. Sett kjelen uten lokk tilbake på plata til resten av kokevannet er dampet bort.");
                       startActivity(Pott);
                       break;
                   case 2:
                       Intent fon = new Intent(MainActivity.this, PannekakerActivity.class);
                       fon.putExtra(EXTRA_TITLE, itemname[position]);
                       fon.putExtra(EXTRA_IMAGE, imgid[position]);
                       fon.putExtra(EXTRA_NEED, "50 g smør\n" +
                               "50 g mørk kokesjokolade\n" +
                               "2 egg\n" +
                               "1/2 dl sukker\n" +
                               "1/2 dl hvetemel\n" +
                                "Litt melis til pynt");
                       startActivity(fon);
                       break;
               }

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent settingz = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(settingz);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
