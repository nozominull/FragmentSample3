package com.nozomi.fragmentsample3;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class Fragment1 extends Fragment {

	public static Fragment1 newInstance() {
		Fragment1 fragment = new Fragment1();
		return fragment;
	}

	public Fragment1() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.simple_fragment, container,
				false);
		TextView textView = (TextView) rootView
				.findViewById(R.id.text);
		textView.setText("1");
		return rootView;
	}
}