package mm.com.fairway.mylesson10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent secondIntent = getIntent();
        String message=secondIntent.getStringExtra("HELLO_MESSAGE");

        TextView myTextView = ((TextView)findViewById(R.id.textView));
        myTextView.setText(message);
    }
}
