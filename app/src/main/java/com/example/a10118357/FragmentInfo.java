package com.example.a10118357;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

import com.example.a10118357.fragments.FragmentInfo1;
import com.example.a10118357.fragments.FragmentInfo2;

public class FragmentInfo extends Fragment {

    //Tanggal   : 02 Juni 2021
    //NIM       : 10118357
    //Nama      : Hery Sanjaya Situmorang
    //Kelas     : IF9

    private ViewPager pager;
    private SlidePagerAdapter pagerAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        List<Fragment> list = new ArrayList<>();
        list.add(new FragmentInfo1());
        list.add(new FragmentInfo2());

        pager = view.findViewById(R.id.pager);
        pagerAdapter = new SlidePagerAdapter(requireActivity().getSupportFragmentManager(),list);
        pager.setAdapter(pagerAdapter);
        return view;
    }
}
