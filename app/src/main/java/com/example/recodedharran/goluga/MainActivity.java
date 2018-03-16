package com.example.recodedharran.goluga;



import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.recodedharran.goluga.Fragments.HomeFragment;
import com.example.recodedharran.goluga.Fragments.DiscoverFragment;
import com.example.recodedharran.goluga.Fragments.UserFragment;



public class MainActivity extends AppCompatActivity {
    private DiscoverFragment discoverFragment;
    private HomeFragment homeFragment;
    private UserFragment userFragment;
    private BottomNavigationView mainNav;
    private FrameLayout frameLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainNav = findViewById(R.id.nav_main);
        frameLayout = findViewById(R.id.main_frame);

        homeFragment=new HomeFragment();
        discoverFragment=new DiscoverFragment();
        userFragment=new UserFragment();


        /** this for setting the default fragment that will be displayed when the app is opened*/
        setFragment(homeFragment);
        BottomNavigationViewHelper.removeShiftMode(mainNav);
        mainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.home_item:                        //mainNav.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(homeFragment);
                        setTitle("Home");
                        return true;

                    case R.id.books_item:
                        // mainNav.setItemBackgroundResource(R.color.colorTransperant);
                        setFragment(userFragment);
                        setTitle("User");
                        return true;

                    case R.id.community_item:
                        // mainNav.setItemBackgroundResource(R.color.colorTransperant);
                        setFragment(discoverFragment);
                        setTitle("Discover");
                        return true;

                    default:
                        return false;
                }
            }
        });
    }
    private void setFragment(Fragment fragment){

        android.support.v4.app.FragmentTransaction fragmentTransaction= getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();


    }
}
