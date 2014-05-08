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
public class Fragment4 extends Fragment {

	public static Fragment4 newInstance() {
		Fragment4 fragment = new Fragment4();
		return fragment;
	}

	public Fragment4() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.simple_fragment, container,
				false);
		TextView textView = (TextView) rootView
				.findViewById(R.id.text);
		textView.setText("4");
		return rootView;
	}
}