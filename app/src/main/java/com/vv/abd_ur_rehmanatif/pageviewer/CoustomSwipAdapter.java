package com.vv.abd_ur_rehmanatif.pageviewer;

import android.content.Context;
import android.media.Image;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by abd-ur-rehmanatif on 21/04/2017.
 */

public class CoustomSwipAdapter extends PagerAdapter {

   private int[] ImagesArray = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.a,R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.a,R.drawable.a,};
   private String[] Name = {"Abdur Rehman ", "Muhammad Atif" , "Fabullah" , "Ali hassand","Abdur Rehman Atif", "Muhammad Atif" , "Fabullah" , "Ali hassand","Abdur Rehman Atif", "Muhammad Atif" , "Fabullah" , "Ali hassand"};
    private String[] ContectNumber = {"123456" , "24352435" , "1243" , "12341234","123456" , "24352435" , "1243" , "12341234","123456" , "24352435" , "1243" , "12341234","123456" , "24352435" , "1243" , "12341234"};

    private Context ctx;

    LayoutInflater inflator ;

    public CoustomSwipAdapter(Context c  ){

        this.ctx = c;

    }


    @Override
    public int getCount() {
        return ImagesArray.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {


        return (view == (RelativeLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        inflator = (LayoutInflater) ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);

        View view = inflator.inflate(R.layout.swip_layout, container , false);

        TextView id = (TextView)view.findViewById(R.id.Id);
        ImageView Image = (ImageView) view.findViewById(R.id.imageView);
        TextView ContectName = (TextView)view.findViewById(R.id.ContectName);
        TextView PhoneNumber = (TextView)view.findViewById(R.id.PhoneNumber);

        id.setText("        ID:        "+position );
        Image.setImageResource(ImagesArray[position]);
        ContectName.setText("     Name:    "+Name[position]);
        PhoneNumber.setText("     Phone:   "+ContectNumber[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((RelativeLayout)object);


    }
}
