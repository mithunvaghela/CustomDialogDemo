package com.example.customdialogdemo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.customdialogdemo.databinding.DialogStage2AdditionalDataEzaziBinding;
import com.example.customdialogdemo.dialog.CustomViewDialogFragment;

/**
 * Created by Vaghela Mithun R. on 27-06-2023 - 11:52.
 * Email : mithun@intelehealth.org
 * Mob   : +919727206702
 **/
public class DialogActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        showCustomDialog();
    }

    private void showCustomDialog() {
        DialogStage2AdditionalDataEzaziBinding binding = DialogStage2AdditionalDataEzaziBinding.inflate(getLayoutInflater(), null, true);
        CustomViewDialogFragment dialog = new CustomViewDialogFragment.Builder(this)
                .title(R.string.additional_information)
                .positiveButtonLabel(R.string.yes)
                .view(binding.getRoot())
                .build();

        dialog.show(getSupportFragmentManager(), dialog.getClass().getCanonicalName());
    }
}
