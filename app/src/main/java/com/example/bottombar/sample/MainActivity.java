package com.example.bottombar.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @SuppressWarnings("ConstantConditions")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Buttons Declaration

        Button simplethreetabs = (Button) findViewById(R.id.simple_three_tabs);
        Button fivetabscc = (Button) findViewById(R.id.five_tabs_changing_colors);
        Button threetabsqr = (Button) findViewById(R.id.three_tabs_quick_return);
        Button fivetabscustomcolors = (Button) findViewById(R.id.five_tabs_custom_colors);
        Button badges = (Button) findViewById(R.id.badges);

        //Button Declaration ends here

        //Button Action declaration starts here

        simplethreetabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ThreeTabsActivity.class);
                MainActivity.this.startActivity(i);
            }
        });

        fivetabscc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, FiveColorChangingTabsActivity.class);
                MainActivity.this.startActivity(i);
            }
        });

        threetabsqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ThreeTabsQRActivity.class);
                MainActivity.this.startActivity(i);
            }
        });

        fivetabscustomcolors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, CustomColorAndFontActivity.class);
                MainActivity.this.startActivity(i);
            }
        });

        badges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, BadgeActivity.class);
                MainActivity.this.startActivity(i);
            }
        });

        // Button action declaration ends here

    }
}
