package com.goldfish07.pbar;

import android.app.AlertDialog;
import android.content.Context;

/*Author Ayush Bisht @goldfish07
 */
public class PBar {

    private Context ctx;
    private AlertDialog.Builder builder;

    public PBar(Context ctx) {
        this.ctx=ctx;
        this.builder = new AlertDialog.Builder(this.ctx);
    }

    public PBar setTitle(String title){
        this.builder.setTitle(title);
        return this;
    }

    public PBar setMessage(String message){
        this.builder.setMessage(message);
        return this;
    }

    public PBar setCancelable(boolean cancelable){
        this.builder.setCancelable(cancelable);
        return this;
    }

    public PBar show(){
        this.builder.create().show();
        return this;
    }
}
