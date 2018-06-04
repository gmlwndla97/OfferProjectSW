package org.androidtown.offerproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.io.InputStream;
import java.io.OutputStream;


public class HowToFragment extends Fragment {

    Button inbtn, outbtn;
    OutputStream mOutputStream = null;
    String mStrDelimiter = "\n";


    public HowToFragment() {
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
        return inflater.inflate(R.layout.fragment_how_to, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        init();
        inbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //HowToFragment.this.sendData("i");
                Toast.makeText(getContext(), "in 선택", Toast.LENGTH_SHORT).show();
            }
        });

        outbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //HowToFragment.this.sendData("o");
                Toast.makeText(getContext(), "out 선택", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void init(){
        inbtn = (Button) getActivity().findViewById(R.id.inbtn);
        outbtn = (Button) getActivity().findViewById(R.id.outbtn);
    }

    void sendData(String paramString)
    {
        paramString = paramString + mStrDelimiter;
        try
        {
            mOutputStream.write(paramString.getBytes());
            return;
        }
        catch (Exception e)
        {
            Toast.makeText(getContext(), "데이터 전송 중 오류 발생.", Toast.LENGTH_SHORT).show();
            getActivity().finish();
        }
    }

}
