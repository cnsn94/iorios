package com.ioriosgelato.iorios;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    //Integer[] imageId = {
     //       R.drawable.image1,
     //       R.drawable.image1,
    //        R.drawable.image1,
    //        R.drawable.image1,
  //         R.drawable.image1,
   //         R.drawable.image1,
   //         R.drawable.image1,
   //         R.drawable.image1
   // }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new GelatoFragment(this))
                    .commit();
        }
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

   // @Override
    //public static Drawable LoadImageFromWebOperations(String url) {
     //   try {
     //       InputStream is = (InputStream) new URL(url).getContent();
     //       Drawable d = Drawable.createFromStream(is, "src name");
       //     return d;
       // } catch (Exception e) {
        //    return null;
       // }
  //  }
}

// xml TextView OG stuff
// <TextView android:text="@string/hello_world" android:layout_width="wrap_content"
// android:layout_height="wrap_content" />