package com.example.customdialogdemo.dialog.listener;

/**
 * Created by Vaghela Mithun R. on 15-05-2023 - 15:54.
 * Email : mithun@intelehealth.org
 * Mob   : +919727206702
 **/
public interface OnDialogActionListener {
    void onSubmit();

    default void onDismiss() {
    }

    ;
}
