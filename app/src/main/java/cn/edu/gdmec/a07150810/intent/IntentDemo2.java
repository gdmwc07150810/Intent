package cn.edu.gdmec.a07150810.intent;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by qaq on 2016/10/30.
 */
public class IntentDemo2 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_intent_demo2);
    }
    public void upper(View v){
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        final String value=bundle.getString("value").toUpperCase();

        Intent intentresult=new Intent();
        intentresult.putExtra("result",value);
        setResult(RESULT_OK,intentresult);
        finish();
    }
}
