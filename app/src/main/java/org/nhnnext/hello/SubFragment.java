package org.nhnnext.hello;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by eunjooim on 16. 1. 13.
 */
public class SubFragment extends Fragment {

    public interface FragmentChangeCallback {
        void OnFragmentChanged(int position);
    }

    FragmentChangeCallback callback;

    @Override
    public void onAttach(Context context) {
        // fragment에서 가장 먼저 호출됨
        callback = (FragmentChangeCallback) getActivity();

        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.sub_layout, container, false);

        Button button = (Button) rootView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.OnFragmentChanged(1);
            }
        });
        return rootView;
    }
}
