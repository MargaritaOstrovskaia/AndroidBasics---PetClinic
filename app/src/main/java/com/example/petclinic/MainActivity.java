package com.example.petclinic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private TextView textServices;
    private TextView textHours;
    private TextView textAddress;

    private TextView textServicesVal;
    private TextView textHoursVal1;
    private TextView textHoursVal2;
    private TextView textAddressVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textServices = findViewById(R.id.services);
        textHours = findViewById(R.id.hours);
        textAddress = findViewById(R.id.address);

        textServicesVal = findViewById(R.id.serviceVal);
        textHoursVal1 = findViewById(R.id.hoursVal1);
        textHoursVal2 = findViewById(R.id.hoursVal2);
        textAddressVal = findViewById(R.id.addressVal);

        textServices.setTextColor(getColor(R.color.holo_red_dark));
        textHours.setTextColor(getColor(R.color.holo_green_dark));
        textAddress.setTextColor(getColor(R.color.holo_green_dark));
    }

    public void onService(View view) {
        textServices.setTextColor(getColor(R.color.holo_red_dark));
        textHours.setTextColor(getColor(R.color.holo_green_dark));
        textAddress.setTextColor(getColor(R.color.holo_green_dark));

        textServicesVal.setVisibility(View.VISIBLE);
        textAddressVal.setVisibility(View.INVISIBLE);
        setTextHoursVal(View.INVISIBLE);
    }

    public void onHours(View view) {
        textServices.setTextColor(getColor(R.color.holo_green_dark));
        textHours.setTextColor(getColor(R.color.holo_red_dark));
        textAddress.setTextColor(getColor(R.color.holo_green_dark));

        textServicesVal.setVisibility(View.INVISIBLE);
        textAddressVal.setVisibility(View.INVISIBLE);
        setTextHoursVal(View.VISIBLE);
    }

    public void onAddress(View view) {
        textServices.setTextColor(getColor(R.color.holo_green_dark));
        textHours.setTextColor(getColor(R.color.holo_green_dark));
        textAddress.setTextColor(getColor(R.color.holo_red_dark));

        textServicesVal.setVisibility(View.INVISIBLE);
        textAddressVal.setVisibility(View.VISIBLE);
        setTextHoursVal(View.INVISIBLE);
    }

    private void setTextHoursVal(int v)
    {
        textHoursVal1.setVisibility(v);
        textHoursVal2.setVisibility(v);
    }
}
