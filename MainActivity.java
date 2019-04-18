package mm.com.fairway.mylesson10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displaySecondActivity(View view) {
        Intent intent = new Intent(this,SecondActivity.class);

        // input another activity to string message
        intent.putExtra("HELLO_MESSAGE","@CopyRight All right Reserve 2019");
        startActivity(intent);
    }
}
