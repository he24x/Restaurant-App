package com.example.restaurantapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantapp.MyAdapter;
import com.example.restaurantapp.R;
import com.example.restaurantapp.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    RecyclerView recyclerView;

    String s1[],s2[];
    int images[] = {R.drawable.sushi1,R.drawable.sushi2,R.drawable.sushi3,R.drawable.sushi4,R.drawable.sushi5,R.drawable.sushi6,R.drawable.sushi7,R.drawable.sushi8,R.drawable.sushi9,R.drawable.sushi10,R.drawable.sushi11};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        recyclerView=root.findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.dishes);
        s2 = getResources().getStringArray(R.array.ingredients);

        MyAdapter myAdapter = new MyAdapter(getContext(), s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
