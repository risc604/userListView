package com.example.tomcat.userlistview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.HashMap;

/**
 * Created by tomcat on 2016/4/12.
 */
public class UserAdapter extends BaseAdapter
{
    private String  deviceName;
    private HashMap<String, Integer>    rssiList;

    @Override
    public int getCount()
    {
        return 0;
    }

    @Override
    public Object getItem(int position)
    {
        return null;
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder  mHolder;

        return null;
    }

    private class ViewHolder
    {
        String  deviceName;
        String  deviceAddress;
        String  deviceRssi;
    }
}
