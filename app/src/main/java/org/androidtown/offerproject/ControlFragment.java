package org.androidtown.offerproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.OutputStream;


public class ControlFragment extends Fragment {



    public ControlFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_control, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        SeekBar seekBar = (SeekBar)getActivity().findViewById(R.id.seekBar);
        int fireValue;
        final TextView showValue = (TextView)getActivity().findViewById(R.id.textView);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                //드래그 하는 중에 발생
                showValue.setText("현재 불세기: "+i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //최초에 탭하여 드래그 시작할때
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //드래그 멈출때 발생
               /* if(fire_power==1){
                    Control.this.sendData("1");
                    Toast.makeText(getApplicationContext(), "선택된 불세기 : "+ fire_power, Toast.LENGTH_SHORT).show();
                }
                else if(fire_power==2){
                    Control.this.sendData("2");
                    Toast.makeText(getApplicationContext(), "선택된 불세기 : "+ fire_power, Toast.LENGTH_SHORT).show();
                }
                else if(fire_power==0){
                    Control.this.sendData("0");
                    Toast.makeText(getApplicationContext(), "선택된 불세기 : "+fire_power, Toast.LENGTH_SHORT).show();
                }*/
            }
        });
    }
}
