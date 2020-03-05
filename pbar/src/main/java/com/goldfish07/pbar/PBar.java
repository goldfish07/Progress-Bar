package com.goldfish07.pbar;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.TextView;

import me.zhanghai.android.materialprogressbar.MaterialProgressBar;

/*Author Ayush Bisht @goldfish07
 */
public class PBar extends AlertDialog {

    private Context ctx;
    private AlertDialog.Builder builder;
    private View view;
    private TextView message;
    public PBar(Context ctx) {
        super(ctx);
        this.ctx=ctx;
        this.builder = new AlertDialog.Builder(this.ctx);
        view =  getLayoutInflater().inflate(R.layout.pbar_main,null,false);
        message = view.findViewById(R.id.message);
        builder.setView(view);
    }

    public PBar setTitle(String title){
        this.builder.setTitle(title);
        return this;
    }

    public PBar setMessage(String message){
        this.message.setText(message);
        return this;
    }

    public void setCancelable(boolean cancelable){
        this.builder.setCancelable(cancelable);
    }

    public void show(){
        this.builder.create().show();
    }
}
