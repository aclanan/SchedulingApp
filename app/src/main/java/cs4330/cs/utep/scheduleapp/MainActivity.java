package cs4330.cs.utep.scheduleapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Toast.makeText(getApplicationContext(),"Home Clicked",Toast.LENGTH_SHORT).show();
//                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_viewSchedule:
                    Toast.makeText(getApplicationContext(),"View Clicked",Toast.LENGTH_SHORT).show();
                    new DisplaySchedule().execute();
                    return true;
                case R.id.navigation_switchShifts:
                    Toast.makeText(getApplicationContext(),"Switch Shifts Clicked",Toast.LENGTH_SHORT).show();

//                    mTextMessage.setText(R.string.title_switchShifts);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
