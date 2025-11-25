package hftvis.ichxtenebra.help_from_the_void_origins;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle s) {
        super.onCreate(s);
        getWindow().getDecorView().setSystemUiVisibility(5894);
        setContentView(R.layout.main);
    }
    
    @Override
    public void onWindowFocusChanged(boolean f) {
        super.onWindowFocusChanged(f);
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }
}
