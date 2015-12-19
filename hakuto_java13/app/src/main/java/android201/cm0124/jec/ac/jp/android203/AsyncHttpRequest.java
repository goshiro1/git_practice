package android201.cm0124.jec.ac.jp.android203;

import android.net.Uri;
import android.os.AsyncTask;
import android.widget.TextView;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by ogawahakuto on 15/12/18.
 */
public class AsyncHttpRequest extends AsyncTask<Uri.Builder,Void,String> {
    private MainActivity mainActivity;

    public AsyncHttpRequest(MainActivity activity) {
        this.mainActivity = activity;
    }

    @Override
    protected String doInBackground(Uri.Builder... builder) {
        String resStr = "取得に失敗しました";
        String uri = builder[0].toString();
        HttpClient httpClient = new DefaultHttpClient();
        HttpUriRequest httpRequest = new HttpGet(uri);

        HttpResponse httpResponse =null;
        try {
            httpResponse = httpClient.execute(httpRequest);
            if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                HttpEntity httpEntity = httpResponse.getEntity();
                resStr = EntityUtils.toString(httpEntity);
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  resStr;
    }
    @Override
    protected void onPostExecute(String result){
        TextView txt = (TextView)mainActivity.findViewById(R.id.txtContents);
        txt.setText(result);
    }
}
