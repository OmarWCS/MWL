package fr.wcs.monsterwikilegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Creation extends AppCompatActivity {

    Button buttoncreationtolist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation);
        buttoncreationtolist = (Button) findViewById(R.id.buttoncreationtolist);
        buttoncreationtolist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toAddNewMonster = new Intent(Creation.this, Bestiaire.class);
                startActivity(toAddNewMonster);
            }
        });
    }
}
