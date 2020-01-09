package com.example.checkboxdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onCheckboxClicked(View view)
    {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId())
        {
            case R.id.checkbox_meat:
                if (checked)
                {
                    // Put some meat on the sandwich
                    showmsg("Selected Item","Meat");
                }
                else
                {
                    // Remove the meat
                    showmsg("Unselected Item","Meat");
                }

                break;

            case R.id.checkbox_cheese:
                if (checked)
                {
                    // Cheese me
                    showmsg("Selected Item","Cheese");
                }

            else
                {
                    // I'm lactose intolerant
                    Toast.makeText(this, "Please Select Item", Toast.LENGTH_SHORT).show();
                }

                break;

            // TODO: Veggie sandwich

        }
    }


    private void showmsg(String selected_item, String item)
    {
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(selected_item);
        builder.setMessage(item);
        builder.show();
    }


}
