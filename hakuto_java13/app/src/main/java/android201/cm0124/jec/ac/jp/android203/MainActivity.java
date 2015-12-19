package android201.cm0124.jec.ac.jp.android203;


import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
/**
 * Created by ogawahakuto on 15/12/18.
 */

public class MainActivity extends ActionBarActivity {

    private Button btn = (Button)findViewById(R.id.btnGet);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());


            final Spinner spn = (Spinner)findViewById(R.id.srcMode);
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = (String)spn.getSelectedItem();
                if (item.equals("Wikipediaから探す")){
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri.Builder uriBuilder = new Uri.Builder();
                            EditText edt = (EditText)findViewById(R.id.edtSearch);
                            String search = edt.getText().toString();
                            //Uriの作成フェーズ
                            //Wikipedia
                            uriBuilder.scheme("http");
                            uriBuilder.authority("ja.wikipedia.org");
                            uriBuilder.path("/w/api.php");
                            uriBuilder.appendQueryParameter("export", "");
                            uriBuilder.appendQueryParameter("format","txt");
                            uriBuilder.appendQueryParameter("titles",search);
                            AsyncHttpRequest req = new AsyncHttpRequest(MainActivity.this);
                            req.execute(uriBuilder);
                        }
                    });
                }else if (item.equals("国会図書館から探す")) {
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri.Builder uriBuilder = new Uri.Builder();
                            EditText edt = (EditText)findViewById(R.id.edtSearch);
                            String search = edt.getText().toString();
                            //Uriの作成フェーズ
                            uriBuilder.scheme("http");
                            uriBuilder.authority("iss.ndl.go.jp");
                            uriBuilder.path("/api/opensearch");
                            uriBuilder.appendQueryParameter("titles",search);
                            AsyncHttpRequest req = new AsyncHttpRequest(MainActivity.this);
                            req.execute(uriBuilder);
                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
