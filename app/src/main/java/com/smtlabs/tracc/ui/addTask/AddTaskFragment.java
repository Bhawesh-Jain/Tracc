package com.smtlabs.tracc.ui.addTask;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.smtlabs.tracc.databinding.FragmentAddTaskBinding;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class AddTaskFragment extends Fragment {

    private FragmentAddTaskBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentAddTaskBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.icBack.setOnClickListener(view1 -> getActivity().onBackPressed());

        binding.newTaskIcon.setOnClickListener(view1 ->{

            AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());


        });
    }

}