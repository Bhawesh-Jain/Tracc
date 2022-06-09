package com.smtlabs.tracc.ui.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.smtlabs.tracc.R;
import com.smtlabs.tracc.databinding.ActivityHomeBinding;
import com.smtlabs.tracc.ui.addTask.AddTaskFragment;
import com.smtlabs.tracc.ui.report.ReportFragment;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bottomNavBarReportIc.setOnClickListener(view -> setContent(new ReportFragment(), true, R.id.container_withNav));

        binding.bottomNavBarAddIc.setOnClickListener(view -> setContent(new AddTaskFragment(), true, R.id.container_full));

    }
    public void setContent(@NonNull Fragment fragment, boolean addToBackStack, int container) {
        Fragment current = getSupportFragmentManager().findFragmentById(container);
        if (current == null || !current.getClass().equals(fragment.getClass())) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            if (addToBackStack) {
                transaction.setCustomAnimations(R.anim.enter_from_bottom, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                transaction.addToBackStack(null).add(container, fragment).commit();
            }
            else {
                transaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                transaction.replace(container, fragment).commit();
            }
        }
    }
}