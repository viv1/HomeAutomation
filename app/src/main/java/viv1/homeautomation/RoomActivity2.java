package viv1.homeautomation;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.List;


public class RoomActivity2 extends ActionBarActivity {

    private Button add_button;
    private Button remove_button;
    private Button butt16;
    private Button butt17;
    private Button butt18;
    private Button butt19;
    private Button butt20;
    private Button butt21;
    private Button butt22;
    private Button butt23;
    private Button butt24;
    private Button butt25;
    private Button butt26;
    private Button butt27;
    private Button butt28;
    private Button butt29;
    private Button butt30;
    private Button butt31;
    private Button butt32;
    private Button butt33;
    private Button butt34;
    private Button butt35;
    private Button butt36;
    private Button butt37;
    private Button butt38;
    private Button butt39;
    private Button butt40;
    private Button butt41;
    private Button butt42;
    private Button butt43;
    private Button butt44;
    private Button butt45;
    private Button butt46;
    private Button butt47;
    private Button butt48;
    private Button butt49;
    private Button butt50;
    private Button butt51;
    private Button butt52;
    private Button butt53;
    private Button butt54;
    private Button butt55;
    private Button butt56;
    private Button butt57;
    private Button butt58;
    private Button butt59;
    private Button butt60;
    private Button butt61;
    private Button butt62;
    private Button butt63;
    private Button butt64;
    private Button butt65;
    private Button butt66;
    private Button butt67;
    private Button butt68;
    private Button butt69;
    private Button butt70;
    private Button butt71;
    private Button butt72;

    private String string_name;
    private String string_address;
    private int room_num=0;
    private int button_number=15;

    String sddw;
    int no_rows;

    DatabaseHelper2 databaseHelper;
    Cursor cursor;

    private String[] room_name;
    private String[] room_address;

    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        Populate();//Populate from database


        add_button=(Button) findViewById(R.id.button15);
        // remove_button=(Button) findViewById(R.id.button14);
        butt16=(Button) findViewById(R.id.button16);
        butt17=(Button) findViewById(R.id.button17);
        butt18=(Button) findViewById(R.id.button18);
        butt19=(Button) findViewById(R.id.button19);
        butt20=(Button) findViewById(R.id.button20);
        butt21=(Button) findViewById(R.id.button21);
        butt22=(Button) findViewById(R.id.button22);
        butt23=(Button) findViewById(R.id.button23);
        butt24=(Button) findViewById(R.id.button24);
        butt25=(Button) findViewById(R.id.button25);
        butt26=(Button) findViewById(R.id.button26);
        butt27=(Button) findViewById(R.id.button27);
        butt28=(Button) findViewById(R.id.button28);
        butt29=(Button) findViewById(R.id.button29);
        butt30=(Button) findViewById(R.id.button30);
        butt31=(Button) findViewById(R.id.button31);
        butt32=(Button) findViewById(R.id.button32);
        butt33=(Button) findViewById(R.id.button33);
        butt34=(Button) findViewById(R.id.button34);
        butt35=(Button) findViewById(R.id.button35);
        butt36=(Button) findViewById(R.id.button36);
        butt37=(Button) findViewById(R.id.button37);
        butt38=(Button) findViewById(R.id.button38);
        butt39=(Button) findViewById(R.id.button39);
        butt40=(Button) findViewById(R.id.button40);
        butt41=(Button) findViewById(R.id.button41);
        butt42=(Button) findViewById(R.id.button42);
        butt43=(Button) findViewById(R.id.button43);
        butt44=(Button) findViewById(R.id.button44);
        butt45=(Button) findViewById(R.id.button45);
        butt46=(Button) findViewById(R.id.button46);
        butt47=(Button) findViewById(R.id.button47);
        butt48=(Button) findViewById(R.id.button48);
        butt49=(Button) findViewById(R.id.button49);
        butt50=(Button) findViewById(R.id.button50);
        butt51=(Button) findViewById(R.id.button51);
        butt52=(Button) findViewById(R.id.button52);
        butt53=(Button) findViewById(R.id.button53);
        butt54=(Button) findViewById(R.id.button54);
        butt55=(Button) findViewById(R.id.button55);
        butt56=(Button) findViewById(R.id.button56);
        butt57=(Button) findViewById(R.id.button57);
        butt58=(Button) findViewById(R.id.button58);
        butt59=(Button) findViewById(R.id.button59);
        butt60=(Button) findViewById(R.id.button60);
        butt61=(Button) findViewById(R.id.button61);
        butt62=(Button) findViewById(R.id.button62);
        butt63=(Button) findViewById(R.id.button63);
        butt64=(Button) findViewById(R.id.button64);
        butt65=(Button) findViewById(R.id.button65);
        butt66=(Button) findViewById(R.id.button66);
        butt67=(Button) findViewById(R.id.button67);
        butt68=(Button) findViewById(R.id.button68);
        butt69=(Button) findViewById(R.id.button69);
        butt70=(Button) findViewById(R.id.button70);
        butt71=(Button) findViewById(R.id.button71);
        butt72=(Button) findViewById(R.id.button72);



        //*****************************************************************************
/*

        //Database for storing and retrieving
        DatabaseHelper2 databaseHelper = new DatabaseHelper2(this);
        db= databaseHelper.getWritableDatabase();

        ContentValues values1 = new ContentValues();
        ContentValues values2 = new ContentValues();
        ContentValues values3 = new ContentValues();
        ContentValues values4 = new ContentValues();
        values1.put("bid", "kk1");
        values1.put("room_name", "kk2");
        values1.put("room_address", "kk3");
        values1.put("isVisible", "kk4");

        long insertId = db.insert("room1", null,values1);

        Cursor cursor= db.query("room1",new String[] { "bid", "room_name", "room_address", "isVisible"},null, null, null, null, null);
        no_rows=cursor.getCount();//no of rows in database

        cursor.moveToFirst();
        sddw=cursor.getString(3);//indexing from 0

        //Traversing the rows in the database
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            cursor.moveToNext();
        }


        cursor.close();

*/

        //*****************************************************************************

//        Intent intent=getIntent();
//        Bundle extras= intent.getExtras();
//        if(extras!=null){
//            string_name=extras.getString("name");
//            string_address=extras.getString("address");
//            device_num=extras.getString("string_num");
//
//                        int tempMaxnum=Integer.parseInt(device_num);
//                    for(int i=16;i<=tempMaxnum;i++) {
//                        String buttid = "button" + device_num;
//                        int resID = getResources().getIdentifier(buttid, "id", "viv1.homeautomation");
//                        Button b = (Button) findViewById(resID);
//                        b.setText(string_name);
//                        b.setVisibility(View.VISIBLE);
//                    }
//        }

        add_button.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {

//                        String buttid="button"+device_num;
//                        int resID = getResources().getIdentifier(buttid, "id", "viv1.homeautomation");
//                        Button b= (Button) findViewById(resID);
//                       // b.setText();
//                        b.setVisibility(View.VISIBLE);
//                        if(device_num!=null){
//                            button_number =Integer.parseInt(device_num);
//                            button_number++;
//
//                        }else button_number++;
                        showPopUp2(view);




                    }
                });

//        remove_button.setOnClickListener(
//                new View.OnClickListener()
//                {
//                    public void onClick(View view)
//                    {
//                        Intent connectToUrl=new Intent(view.getContext(),DisplayResults.class);
//                        //String url=online_url.getText().toString();
//                        //connectToUrl.putExtra("url",url );
//                        startActivity(connectToUrl);
//
//                    }
//                });

        //TO DO....
        //USE A LOOP FOR VISITING PAGES AND EDITING

        for(int i=16;i<=70;i++){

            final int j=i;      //cannot use i inside inner class unless declared final, and final variable cannot be re assigned...so using j like this.
            String bid = "button" + i;
            int resID = getResources().getIdentifier(bid, "id", "viv1.homeautomation");
            Button b = (Button) findViewById(resID);
            b.setOnClickListener(
                    new View.OnClickListener()
                    {
                        public void onClick(View view)
                        {
                            goToAddress(view, j-15);
                        }
                    });

            //Long Click behaviour

            b.setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View view) {
                    showEditPopUp(view,j-15);
                    return true;  // avoid extra click events
                }
            });

        }


    }


    public void openPage(int i, String s, View view){
        Intent connectToUrl=new Intent(view.getContext(),WebPageActivity.class);
        String url="http://www.google.com";
        connectToUrl.putExtra("url",url );
        startActivity(connectToUrl);

    }
    private void showPopUp2(final View view) {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("New Location");
        helpBuilder.setMessage("Enter details");
//        final EditText input = new EditText(this);
//        input.setSingleLine();
//        input.setText("");
//        helpBuilder.setView(input);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        final EditText input = new EditText(this);
        input.setHint("Name");
        layout.addView(input);

        final EditText input2 = new EditText(this);
        input2.setHint("Url Address");
        layout.addView(input2);

        helpBuilder.setView(layout);

        helpBuilder.setNeutralButton("Submit", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                room_num++;
                if(room_num>50) {Toast.makeText(RoomActivity2.this, "Cannot Add more!", Toast.LENGTH_SHORT).show();room_num=50;}
                else {
                    room_name[room_num] = input.getText().toString();
                    room_address[room_num] = input2.getText().toString();

                    int temp_b = room_num + 15;
                    String buttid = "button" + temp_b;
                    int resID = getResources().getIdentifier(buttid, "id", "viv1.homeautomation");
                    Button b = (Button) findViewById(resID);
                    b.setText(room_name[room_num]);
                    b.setVisibility(View.VISIBLE);


                    //Insert into database
                    ContentValues values1 = new ContentValues();
                    values1.put("bid", temp_b+"");
                    values1.put("room_name", room_name[room_num]);
                    values1.put("room_address", room_address[room_num]);
                    values1.put("isVisible", "true");

                    long insertId = db.insert("room1", null,values1);
                }

            }
        });

        // Remember, create doesn't show the dialog
        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();

    }

    private void showEditPopUp(final View view, final int num) {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Edit Location");
        helpBuilder.setMessage("Enter details");
//        final EditText input = new EditText(this);
//        input.setSingleLine();
//        input.setText("");
//        helpBuilder.setView(input);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        final EditText input = new EditText(this);
        input.setText(room_name[num]);
        layout.addView(input);

        final EditText input2 = new EditText(this);
        input2.setText(room_address[num]);
        layout.addView(input2);

        helpBuilder.setView(layout);

        helpBuilder.setNeutralButton("Delete", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

//                room_name[num] = input.getText().toString();
//                room_address[num] = input2.getText().toString();
                cursor= db.query("room1",new String[] { "bid", "room_name", "room_address", "isVisible"},null, null, null, null, null);
                no_rows=cursor.getCount();//no of rows in database


                /*Here, we carry out deletion of button in the follwing steps:
                    1.delete the row from database;
                    2.Make all the butttons invisible;
                    3.for button with bid i, update bid of all buttons with bid j such that j>i by subtracting 1;
                    4.Re populate from database
                    */

                //Step 1
                int tb=num+15;

                String selection = "bid"+ " LIKE ?";
                String[] selectionArgs = { String.valueOf(tb+"") };

                long deleteId = db.delete("room1", selection, selectionArgs);

                //Step 2
                for(int j=1;j<=no_rows;j++) {
                    int temp_b = j + 15;
                    String buttid = "button" + temp_b;
                    int resID = getResources().getIdentifier(buttid, "id", "viv1.homeautomation");
                    Button b = (Button) findViewById(resID);
                    //b.setText(room_name[num]);
                    b.setVisibility(View.INVISIBLE);
                }

                //Step 3
                if(num<no_rows) {
                    cursor.moveToPosition(num);
                }else{
                    cursor.moveToLast();        //without this else, there is runtime error on deleting last button
                }
                while (!cursor.isAfterLast()) {
                    String s=cursor.getString(0);
                    int int_s=Integer.parseInt(s);
                    int updated_int_s=int_s-1;
                    String updated_s=updated_int_s+"";
                    //Update database with new value
                    ContentValues values1 = new ContentValues();
                    values1.put("bid", updated_s);

                    String sel= "bid"+ " LIKE ?";
                    String[] selArgs = { String.valueOf(s) };

                    long updateId = db.update("room1", values1, sel, selArgs);

                    cursor.moveToNext();
                }

                cursor.close();

                //Step 4
                Populate();


            }
        });

        helpBuilder.setNegativeButton("Submit", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                room_name[num] = input.getText().toString();
                room_address[num] = input2.getText().toString();

                int temp_b = num + 15;
                String buttid = "button" + temp_b;
                int resID = getResources().getIdentifier(buttid, "id", "viv1.homeautomation");
                Button b = (Button) findViewById(resID);
                b.setText(room_name[num]);
                b.setVisibility(View.VISIBLE);

                //Update database with new value
                ContentValues values1 = new ContentValues();
                values1.put("bid", temp_b+"");
                values1.put("room_name", room_name[num]);
                values1.put("room_address", room_address[num]);
                values1.put("isVisible", "true");

                String selection = "bid"+ " LIKE ?";
                String[] selectionArgs = { String.valueOf(temp_b+"") };

                long updateId = db.update("room1", values1, selection, selectionArgs);


            }
        });

        // Remember, create doesn't show the dialog
        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();

    }

    public void goToAddress(View view,int num){
        Intent room_url=new Intent(view.getContext(),WebPageActivity.class);
        String url=room_address[num];
        room_url.putExtra("url",url );
        int temp=0;
        room_url.putExtra("offline",temp);
        startActivity(room_url);
    }

    public void Populate(){
        //Create/access database
        room_name=new String[55] ;
        room_address=new String[55] ;

        databaseHelper = new DatabaseHelper2(this);
        db= databaseHelper.getWritableDatabase();

        cursor= db.query("room1",new String[] { "bid", "room_name", "room_address", "isVisible"},null, null, null, null, null);
        no_rows=cursor.getCount();//no of rows in database


//Populate from database if database is not empty
        room_num = no_rows;
        if(no_rows>0) {

            cursor.moveToFirst();
            //sddw=cursor.getString(3);//indexing from 0

            //Traversing the rows in the database
            int cnt = 1;
            while (!cursor.isAfterLast()) {
                room_name[cnt] = cursor.getString(1);
                room_address[cnt] = cursor.getString(2);
                cnt++;
                cursor.moveToNext();
            }

            for (int ci = 1; ci < cnt; ci++) {
                int temp_b = ci + 15;
                String buttid = "button" + temp_b;
                int resID = getResources().getIdentifier(buttid, "id", "viv1.homeautomation");
                Button b = (Button) findViewById(resID);
                b.setText(room_name[ci]);
                b.setVisibility(View.VISIBLE);
            }
        }

        cursor.close();     //Close cursor...IMP
    }


    public boolean onKeyDown(int keyCode, KeyEvent event)  {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            Intent i = new Intent(RoomActivity2.this, online_offlineActivity.class);
            startActivity(i);
            return true;

        }

        return super.onKeyDown(keyCode, event);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_room, menu);
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
