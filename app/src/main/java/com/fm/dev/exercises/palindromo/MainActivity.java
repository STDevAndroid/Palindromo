package com.fm.dev.exercises.palindromo;

import com.fm.dev.exercises.palindromo.utils.DefaultCheckedException;
import com.fm.dev.exercises.palindromo.utils.Validation;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Activity de Inicio
 */
public class MainActivity extends AppCompatActivity {

    private Button buttonValidatePalindrome;
    private EditText editTextPalindrome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load an ad into the AdMob banner view.
        AdView adView = findViewById(R.id.adView);

        // Configure the test device using the new RequestConfiguration API.
        RequestConfiguration configuration = new RequestConfiguration.Builder()
                .setTestDeviceIds(java.util.Collections.singletonList("2C49329C3440F4E9E3F427831CC6CDC"))
                .build();
        MobileAds.setRequestConfiguration(configuration);

        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template")
                .build();
        adView.loadAd(adRequest);

        buttonValidatePalindrome = findViewById(R.id.buttonValidatePalindrome);
        editTextPalindrome = findViewById(R.id.editTextPalindrome);

        buttonValidatePalindrome.setOnClickListener(v -> {
            String input = editTextPalindrome.getText().toString();
            try {
                if (Validation.isPalindrome(input)) {
                    Toast.makeText(MainActivity.this, "Es pal\u00edndromo", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "No es pal\u00edndromo", Toast.LENGTH_SHORT).show();
                }
            } catch (DefaultCheckedException e) {
                Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
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

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
