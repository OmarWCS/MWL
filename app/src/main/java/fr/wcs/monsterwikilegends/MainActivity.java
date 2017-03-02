package fr.wcs.monsterwikilegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttoncreation;
    Button buttonbestiaire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttoncreation = (Button) findViewById(R.id.buttoncreation);
        buttonbestiaire = (Button) findViewById(R.id.buttonbestiaire);
        buttonbestiaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toBestiaire = new Intent(MainActivity.this, Bestiaire.class);
                startActivity(toBestiaire);
            }
        });
        buttoncreation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toCreation = new Intent(MainActivity.this, Creation.class);
                startActivity(toCreation);

            }

        });
    }
}
