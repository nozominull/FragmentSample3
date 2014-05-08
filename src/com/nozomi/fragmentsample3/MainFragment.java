package com.nozomi.fragmentsample3;

import com.viewpagerindicator.IconPagerAdapter;
import com.viewpagerindicator.IconTabPageIndicator;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainFragment extends Fragment {

	private Fragment1 fragment1 = Fragment1.newInstance();
	private Fragment2 fragment2 = Fragment2.newInstance();
	private Fragment3 fragment3 = Fragment3.newInstance();

	public static MainFragment newInstance() {
		MainFragment fragment = new MainFragment();
		return fragment;
	}

	public MainFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.main_fragment, container,
				false);

		ViewPager pagerView = (ViewPager) rootView.findViewById(R.id.pager);
		SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(
				getChildFragmentManager());
		pagerView.setAdapter(mSectionsPagerAdapter);

		IconTabPageIndicator indicator = (IconTabPageIndicator) rootView
				.findViewById(R.id.indicator);
		indicator.setViewPager(pagerView);

		return rootView;
	}

	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class SectionsPagerAdapter extends FragmentPagerAdapter implements
			IconPagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			Fragment fragment = null;
			if (position == 0) {
				fragment = fragment1;
			} else if (position == 1) {
				fragment = fragment2;
			} else if (position == 2) {
				fragment = fragment3;
			}

			return fragment;
		}

		@Override
		public int getCount() {
			return 3;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			return String.valueOf(position + 1);
		}

		@Override
		public int getIconResId(int index) {
			if (index == 0) {
				return R.drawable.perm_group_calendar;
			} else if (index == 1) {
				return R.drawable.perm_group_camera;
			} else if (index == 2) {
				return R.drawable.perm_group_location;
			}
			return R.drawable.ic_launcher;
		}

	}
}