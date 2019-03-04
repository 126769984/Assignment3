package mg.studio.weatherappdesign;

import android.os.AsyncTask;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.sql.Time;
import org.json.JSONException;
import org.json.JSONArray;
import org.json.JSONObject;
//port org.json.*;
//import java.io.FileNotFoundException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view) {
        new DownloadUpdate().execute();
    }
   /* //报文信息
    public class JsonInfo
    {
        public Time time ;
        public cityInfo cityinfo ;
        public String date ;
        public String message ;
        public String status ;
        public ContactsContract.Data data ;
        public String temperature;
    }
    //城市信息
    public class cityInfo{
        public String city;
        public String cityID;
        public String parent;
        public Time updateTime;

    }
    //预测信息
    public class forcast{
        public String date;
        public String week;
        public String type;

    }
*/

    private class DownloadUpdate extends AsyncTask<String, Void, String> {


        @Override
        protected String doInBackground(String... strings) {
            //String stringUrl = "https://mpianatra.com/Courses/info.txt";
            String stringUrl = "http://t.weather.sojson.com/api/weather/city/101040100";//需要查询的URL地址
            HttpURLConnection urlConnection = null;//初始化连接地址
            BufferedReader reader;//设置阅读缓冲器

            try {
                URL url = new URL(stringUrl);

                // Create the request to get the information from the server, and open the connection
                urlConnection = (HttpURLConnection) url.openConnection();

                urlConnection.setRequestMethod("GET");//设置命令为“获取”
                urlConnection.connect();//开始连接

                // Read the input stream into a String 把输入流转换成string类型的文字流
                InputStream inputStream = urlConnection.getInputStream();
                StringBuffer buffer = new StringBuffer();//设置一个缓冲区
                if (inputStream == null) {//若输入流为空，不进行操作
                    // Nothing to do.
                    return null;
                }
                reader = new BufferedReader(new InputStreamReader(inputStream));

                String line;
                while ((line = reader.readLine()) != null) {
                    // Mainly needed for debugging
                    Log.d("TAG", line);
                    buffer.append(line + "\n");
                }

                if (buffer.length() == 0) {
                    // Stream was empty.  No point in parsing.
                    return null;
                }



                //The temperature
                return buffer.toString();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (ProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e){
                e.printStackTrace();
            }


            return null;
        }





         @Override
       protected void onPostExecute(String ALL) {
            //Update the temperature displayed
            //((TextView) findViewById(R.id.temperature_of_the_day)).setText(wendu);
             try{
                 //解析json文件信息
                 JSONObject jsonobj = new JSONObject(ALL);//创建新的json对象
                 JSONObject cityInfo = jsonobj.getJSONObject("cityInfo");//城市信息对象
                 JSONObject data = jsonobj.getJSONObject("data");//天气资料对象
                 JSONArray forecast = data.getJSONArray("forecast");//天气预报队列
                 String time = jsonobj.getString("time");
                 String city = cityInfo.getString("city");
                 String wendu = data.getString("wendu");
                 String week[] = new String[5];//预测天数为星期几
                 String type[] = new String[5];//每天的天气类型
                 //String Wendu[] = new String[5];//每天的温度
                 for(int i=0;i<5;i++){
                     week[i] = forecast.getJSONObject(i).getString("week");
                     type[i] = forecast.getJSONObject(i).getString("type");
                 }
                 ((TextView) findViewById(R.id.tv_date)).setText(time);//更新时间
                 ((TextView) findViewById(R.id.tv_location)).setText(city);//更新城市信息
                 ((TextView) findViewById(R.id.temperature_of_the_day)).setText(wendu);//更新温度信息
                 ((TextView) findViewById(R.id.Day1)).setText(week[0]);
                 switch (type[0]){
                     case "晴" :{ImageView imageview = (ImageView)findViewById(R.id.Day1image);
                         imageview.setImageResource(R.drawable.sunny_small); }break;
                     case "小雨" :{ImageView imageview = (ImageView)findViewById(R.id.Day1image);
                         imageview.setImageResource(R.drawable.rainy_small); }break;
                     case "多云" :{ImageView imageview = (ImageView)findViewById(R.id.Day1image);
                         imageview.setImageResource(R.drawable.partly_sunny_small); }break;
                     case "阴" :{ImageView imageview = (ImageView)findViewById(R.id.Day1image);
                         imageview.setImageResource(R.drawable.windy_small); }break;
                 }

                 ((TextView) findViewById(R.id.Day2)).setText(week[1]);
                 switch (type[1]){
                     case "晴" :{ImageView imageview = (ImageView)findViewById(R.id.Day2image);
                         imageview.setImageResource(R.drawable.sunny_small); }break;
                     case "小雨" :{ImageView imageview = (ImageView)findViewById(R.id.Day2image);
                         imageview.setImageResource(R.drawable.rainy_small); }break;
                     case "多云" :{ImageView imageview = (ImageView)findViewById(R.id.Day2image);
                         imageview.setImageResource(R.drawable.partly_sunny_small); }break;
                     case "阴" :{ImageView imageview = (ImageView)findViewById(R.id.Day2image);
                         imageview.setImageResource(R.drawable.windy_small); }break;
                 }

                 ((TextView) findViewById(R.id.Day3)).setText(week[2]);
                 switch (type[2]){
                     case "晴" :{ImageView imageview = (ImageView)findViewById(R.id.Day3image);
                         imageview.setImageResource(R.drawable.sunny_small); }break;
                     case "小雨" :{ImageView imageview = (ImageView)findViewById(R.id.Day3image);
                         imageview.setImageResource(R.drawable.rainy_small); }break;
                     case "多云" :{ImageView imageview = (ImageView)findViewById(R.id.Day3image);
                         imageview.setImageResource(R.drawable.partly_sunny_small); }break;
                     case "阴" :{ImageView imageview = (ImageView)findViewById(R.id.Day3image);
                         imageview.setImageResource(R.drawable.windy_small); }break;
                 }

                 ((TextView) findViewById(R.id.Day4)).setText(week[3]);
                 switch (type[3]){
                     case "晴" :{ImageView imageview = (ImageView)findViewById(R.id.Day4image);
                         imageview.setImageResource(R.drawable.sunny_small); }break;
                     case "小雨" :{ImageView imageview = (ImageView)findViewById(R.id.Day4image);
                         imageview.setImageResource(R.drawable.rainy_small); }break;
                     case "多云" :{ImageView imageview = (ImageView)findViewById(R.id.Day4image);
                         imageview.setImageResource(R.drawable.partly_sunny_small); }break;
                     case "阴" :{ImageView imageview = (ImageView)findViewById(R.id.Day4image);
                         imageview.setImageResource(R.drawable.windy_small); }break;
                 }

                 ((TextView) findViewById(R.id.Day5)).setText(week[4]);
                 switch (type[4]){
                     case "晴" :{ImageView imageview = (ImageView)findViewById(R.id.Day5image);
                         imageview.setImageResource(R.drawable.sunny_small); }break;
                     case "小雨" :{ImageView imageview = (ImageView)findViewById(R.id.Day5image);
                         imageview.setImageResource(R.drawable.rainy_small); }break;
                     case "多云" :{ImageView imageview = (ImageView)findViewById(R.id.Day5image);
                         imageview.setImageResource(R.drawable.partly_sunny_small); }break;
                     case "阴" :{ImageView imageview = (ImageView)findViewById(R.id.Day5image);
                         imageview.setImageResource(R.drawable.windy_small); }break;
                 }
             }
             catch(JSONException e){
                 e.printStackTrace();
             }
        }
    }
}
