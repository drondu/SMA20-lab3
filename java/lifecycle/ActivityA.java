package lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.helloandroid.R;

public class ActivityA extends AppCompatActivity {


    private static final String TAG = "ActivityA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Log.d(TAG,"Oncreate A");
    }

    public void clicked(View view) {
        switch (view.getId()) {
            case R.id.buttonA:
                startActivity(new Intent(this,ActivityA.class));
                Toast.makeText(getApplicationContext(), "START ACTIVITY A", Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonB:
                startActivity(new Intent(this,ActivityB.class));
                Toast.makeText(getApplicationContext(), "START ACTIVITY B", Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonC:
                startActivity(new Intent(this,ActivityC.class));
                Toast.makeText(getApplicationContext(), "START ACTIVITY C", Toast.LENGTH_LONG).show();
                break;
        }

        Log.d(ActivityA.TAG,"clicked A");
    }

    protected void onResume(){
        super.onResume();

        Log.d(ActivityA.TAG,"onResume A");
    }
}

//button backk duce la Activitatea accesata anterior prin apasarea butoanelor
