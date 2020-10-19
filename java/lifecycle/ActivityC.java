package lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.helloandroid.R;

public class ActivityC extends AppCompatActivity {

    private static final String TAG = "ActivityC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        Log.d(TAG,"Oncreate C");
    }

    public void clicked(View view) {
        switch (view.getId()) {
            case R.id.buttonA:
                startActivity(new Intent(this,ActivityA.class));
                break;
            case R.id.buttonB:
                startActivity(new Intent(this,ActivityB.class));
                break;
            case R.id.buttonC:
                startActivity(new Intent(this,ActivityC.class));
                break;
        }

        Log.d(ActivityC.TAG,"clicked C");
    }

    protected void onResume(){
        super.onResume();

        Log.d(ActivityC.TAG,"onResume C");
    }
}