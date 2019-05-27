package com.example.bmicalc;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final EditText heightEdit = view.findViewById(R.id.height_edit);
        final EditText weightEdit = view.findViewById(R.id.weight_edit);

        view.findViewById(R.id.result_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainFragmentDirections.ActionMainFragment2ToResultFragment action = MainFragmentDirections.actionMainFragment2ToResultFragment(
                        Float.valueOf(heightEdit.getText().toString()),
                        Float.valueOf(weightEdit.getText().toString())
                );

                NavController navController = Navigation
                        .findNavController(requireActivity(), R.id.nav_host_fragment);
                navController.navigate(action);
            }
        });
    }

}
