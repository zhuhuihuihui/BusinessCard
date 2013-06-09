package com.businesscard.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.businesscard.R;

/**
 * 创建我的名片
 *
 * Created by Scott Zhu on 13-6-4.
 */
public class CreateMyCardFragment extends Fragment
{
    int mNum;
    /**
     * Create a new instance of CountingFragment, providing "num"
     * as an argument.
     */
    static CreateMyCardFragment newInstance(int num) {
        CreateMyCardFragment f = new CreateMyCardFragment();

        // Supply num input as an argument.
        Bundle args = new Bundle();
        args.putInt("num", num);
        f.setArguments(args);
        return f;
    }


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mNum = getArguments() != null ? getArguments().getInt("num") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_create_my_card, container, false);

        return v;
    }
}
