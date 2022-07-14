package com.example.restaurantapp.ui.notifications;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.restaurantapp.R;
import com.example.restaurantapp.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;
    TextView title,description,name,title2,description2,title3,description3;
    LinearLayout linearLayout,linearLayout2,linearLayout3;
    CardView cardView,cardView2,cardView3;
    ImageView chef;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        title=root.findViewById(R.id.title);
        title2=root.findViewById(R.id.title2);
        title3=root.findViewById(R.id.title3);
        name=root.findViewById(R.id.name);
        chef=root.findViewById(R.id.image);
        description=root.findViewById(R.id.details);
        description2=root.findViewById(R.id.details2);
        description3=root.findViewById(R.id.details3);
        linearLayout=root.findViewById(R.id.layout);
        cardView=root.findViewById(R.id.cardView);
        linearLayout2=root.findViewById(R.id.layout2);
        cardView2=root.findViewById(R.id.cardView2);
        linearLayout3=root.findViewById(R.id.layout3);
        cardView3=root.findViewById(R.id.cardView3);
        linearLayout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = (description.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
                int b = (name.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
                int c = (chef.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(linearLayout, new AutoTransition());
                description.setVisibility(a);
                name.setVisibility(b);
                chef.setVisibility(c);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = (description2.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(linearLayout, new AutoTransition());
                description2.setVisibility(a);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = (description3.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(linearLayout, new AutoTransition());
                description3.setVisibility(a);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}