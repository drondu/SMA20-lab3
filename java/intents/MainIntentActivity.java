package intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.helloandroid.R;

public class MainIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_intent);

        final Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String googleUrl = "https://www.google.com/search?q=";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(googleUrl));
                startActivity(i);
            }
        });

        final Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String telUrl = "tel:00401213456";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(telUrl));
                startActivity(i);
            }
        });

        final Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String googleUrl = "https://www.google.com/search?q=";
                Intent i = new Intent("MSA_LAUNCH", Uri.parse(googleUrl));
                startActivity(i);
            }
        });

        final Button b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String telUrl = "tel:00401213456";
                Intent i = new Intent("MSA_LAUNCH", Uri.parse(telUrl));

                startActivity(i);
            }
        });
    }
}

// pressing the 4 buttons: primele 2 butoane folosec intentul cu action VIEW cu ajutorul url-ului GOOGLE,respectiv al aplicatiei de telefoniei si
// formand nr de telefon,iar urmatoaree 2 butoane  folosesc actiunea custom MSA.LAUNCH ,facand aceleasi actiuni la primele 2 butoane