package com.osamashabrez.dialogboxes;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }
    
    public void exit(View v) {
    	System.exit(0);
    }

    public void dialogAbout(View v) {
		Dialog dialog;
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle(R.string.dialog_about)
		  	.setMessage(Html.fromHtml("This tutorial on Dialog Boxes was written for <a href=\"http://osamashabrez.com\">OsamaShabrez.com</a>"))
		  	.setCancelable(false)
		  	.setIcon(android.R.drawable.ic_dialog_info)
		  	.setPositiveButton(R.string.dialog_action_dismiss, null);
		dialog = builder.create();
		dialog.show();
    }

    public void dialogAlert(View v) {
		Dialog dialog;
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle(R.string.dialog_about)
		  	.setMessage(Html.fromHtml("This tutorial on Dialog Boxes was written for <a href=\"http://osamashabrez.com\">OsamaShabrez.com</a>"))
		  	.setCancelable(false)
		  	.setIcon(android.R.drawable.ic_dialog_info)
		  	.setPositiveButton(R.string.dialog_action_dismiss, null);
		dialog = builder.create();
		dialog.show();
    }
    
    public void dialogCustom(View v) {
    	final Dialog dialog = new Dialog(Main.this);
        dialog.setContentView(R.layout.custom_dialog);
        dialog.setTitle("This is my custom dialog box");
        dialog.setCancelable(true);
        //set up button
        Button button = (Button) dialog.findViewById(R.id.buttonOK);
        button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				dialog.dismiss();
			}
		});
        //now that the dialog is set up, it's time to show it    
        dialog.show();
    }
    
    public void dialogList(View v) {
    	final CharSequence[] items = {"Red", "Green", "Blue"};
    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	builder.setTitle("Pick a color");
	  	builder.setCancelable(false);
	  	builder.setPositiveButton(R.string.dialog_action_dismiss, null);
    	builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
    	    public void onClick(DialogInterface dialog, int item) {
    	        Toast.makeText(getApplicationContext(), items[item], Toast.LENGTH_SHORT).show();
    	    }
    	});
    	AlertDialog alert = builder.create();
    	alert.show();
    }
}
