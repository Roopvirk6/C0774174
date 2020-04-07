package com.example.c0774174;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;


public class CanadaAdapters extends RecyclerView.Adapter<CanadaAdapters.CountryViewHolder>
    {
        private ArrayList<Canada> placeList;
        public CanadaAdapters(ArrayList<Canada> placeList)
        {
            this.placeList = placeList;
        }
        @NonNull
        @Override
        public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View mView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country,parent,false);
            CountryViewHolder mCountryViewHolder = new CountryViewHolder(mView);
            return mCountryViewHolder;
        }
        @Override
        public void onBindViewHolder(@NonNull CountryViewHolder holder, final int position) {
            Canada mCountry = this.placeList.get(position);
            holder.txtname.setText(mCountry.getPlaceName());
            holder.imgflag.setImageResource(mCountry.getPlaceImage());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Canada canada = placeList.get(position);
                    Intent iIntent = new Intent(v.getContext(), AttractionsDetailActivity.class);
                    iIntent.putExtra("Detail", canada);
                      v.getContext().startActivity(iIntent);

                }

            });
        }
        @Override
        public int getItemCount() {
            return this.placeList.size();
        }
        public class CountryViewHolder extends RecyclerView.ViewHolder {
            TextView txtname;
            ImageView imgflag;
            public CountryViewHolder(@NonNull View itemView) {
                super(itemView);
                txtname = itemView.findViewById(R.id.textView);
                imgflag = itemView.findViewById(R.id.imageView);
            }
        }
    }

