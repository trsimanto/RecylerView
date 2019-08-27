package com.towhid.recylerview;



import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=(TabLayout)findViewById(R.id.tablayout_id);
        viewPager=(ViewPager)findViewById(R.id.viewpager_id);
        adapter=new ViewPageAdapter(getSupportFragmentManager());

        //add fragment
        adapter.addFragment(new FragmentCall(),"");
        adapter.addFragment(new FragmentContact(),"");
        adapter.addFragment(new FragmentFav(),"");

        // adding setup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        //icon set in tab
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_local);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_group);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_star);

        // remove shadow from actionbar
        ActionBar actionBar=getSupportActionBar();
        actionBar.setElevation(0);



    }
}
