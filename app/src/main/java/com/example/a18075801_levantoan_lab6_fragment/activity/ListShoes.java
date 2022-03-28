package com.example.a18075801_levantoan_lab6_fragment.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.a18075801_levantoan_lab6_fragment.R;
import com.example.a18075801_levantoan_lab6_fragment.adapter.ShoesAdapter;
import com.example.a18075801_levantoan_lab6_fragment.model.Shoes;

import java.util.ArrayList;
import java.util.List;

public class ListShoes extends AppCompatActivity {
    private List<Shoes> mListShoes;
    private ListView mListView;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.listview_shoes_activity);

        mListShoes = new ArrayList<>();
        mListShoes.add(new Shoes(1,"Nike shoes-discount 50%","Pls touch to see detail"));
        mListShoes.add(new Shoes(2,"Adidas shoes-discount 80%","Pls touch to see detail"));
        mListShoes.add(new Shoes(3,"Nike bicycle-discount 30%","Pls touch to see detail"));
        mListShoes.add(new Shoes(4,"Yonex shoes-discount 50%","Pls touch to see detail"));
        mListShoes.add(new Shoes(5,"Victor shoes-discount 50%","Pls touch to see detail"));
        mListShoes.add(new Shoes(6,"Lining shoes-discount 50%","Pls touch to see detail"));
        mListShoes.add(new Shoes(7,"Binh Minh shoes-discount 90%","Pls touch to see detail"));

        ShoesAdapter adapter = new ShoesAdapter(this,mListShoes,R.layout.listview_shoes_activity);
        mListView.setAdapter(adapter);

        mListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListShoes.this,ShoesDetail.class);
                startActivity(intent);
            }
        });
    }
}
