package stark.tony.circleprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import stark.tony.library.CircleProgressBar;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    CircleProgressBar progressBar = new CircleProgressBar(this);


  }
}
