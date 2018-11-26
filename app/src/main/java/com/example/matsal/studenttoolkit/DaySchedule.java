package com.example.matsal.studenttoolkit;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class DaySchedule extends AppCompatActivity {

    private static final Integer pageCount = 5;
    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("function","DaySchedule.onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_schedule);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        TabLayout tabLayout = findViewById(R.id.dayTabs);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d("function","DaySchedule.onCreateOptionsMenu");
        getMenuInflater().inflate(R.menu.menu_day_schedule, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d("function","DaySchedule.onOptionsItemSelected");
        int id = item.getItemId();

        if (id == R.id.global_settings) {
            Intent intent = new Intent(DaySchedule.this, SettingsActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
            Log.d("function","SectionsPagerAdapter");
        }

        @Override
        public Fragment getItem(int position) {
            Log.d("function","SectionsPagerAdapter.getItem");
            switch (position+1) {
                case 1:
                    Fragment fr1 = new MondayFragLayout();
                    return fr1;
                case 2:
                    Fragment fr2 = new TuesdayFragLayout();
                    return fr2;
                case 3:
                    Fragment fr3 = new WednesdayFragLayout();
                    return fr3;
                case 4:
                    Fragment fr4 = new ThursdayFragLayout();
                    return fr4;
                case 5:
                    Fragment fr5 = new FridayFragLayout();
                    return fr5;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return pageCount;
        }
        @Override
        public CharSequence getPageTitle(int position) {
            Log.d("function","CharSequence");
            return "rest";
        }

    }
}
