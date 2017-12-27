package tw.com.pcschool.dd2017122701;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v)
    {
        EditText ed1, ed2;
        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);
        int q1 = Integer.valueOf(ed1.getText().toString());
        int q2 = Integer.valueOf(ed2.getText().toString());
        int ans = q1 + q2;
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText(String.valueOf(ans));
    }
}
