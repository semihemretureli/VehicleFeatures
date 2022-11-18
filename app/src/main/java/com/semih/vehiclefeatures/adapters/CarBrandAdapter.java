package com.semih.vehiclefeatures.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.semih.vehiclefeatures.CarInfo;
import com.semih.vehiclefeatures.CarInfoActivity;
import com.semih.vehiclefeatures.CarModelsActivity;
import com.semih.vehiclefeatures.R;

import java.util.List;

public class CarBrandAdapter extends RecyclerView.Adapter<CarBrandAdapter.CarBrandHolder> {
    List<CarInfo> carInfoList;
    Context context;
    boolean isModelActivity = false;
    private Intent CarInfoActivity;

    public CarBrandAdapter(List<CarInfo> carInfoList, Context context, boolean isModelActivity) {
        this.carInfoList = carInfoList;
        this.context = context;
        this.isModelActivity = isModelActivity;
    }

    @NonNull
    @Override
    public CarBrandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_brand_layout, parent, false);
        CarBrandHolder viewHolder = new CarBrandHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CarBrandHolder holder, int position) {
        holder.bindCarBrand(carInfoList.get(position));
    }

    @Override
    public int getItemCount() {
        return carInfoList.size();
    }

    public class CarBrandHolder extends RecyclerView.ViewHolder{
       Button btnCarBrand;
        private Context mContext;

        public CarBrandHolder(@NonNull View itemView) {
            super(itemView);
            btnCarBrand = itemView.findViewById(R.id.btn_car_brand);
        }

        public void bindCarBrand(CarInfo carInfo) {

            if(!isModelActivity) {
                btnCarBrand.setText(carInfo.getBrand());
            } else {
                btnCarBrand.setText(carInfo.getModel());
            }
            btnCarBrand.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(!isModelActivity) {
                        Intent intent = new Intent(context, CarModelsActivity.class);
                        intent.putExtra("carInfo", carInfo);
                        context.startActivity(intent);
                    } else {
                        //TODO: Tıklanan CarInfo'you göndererek CarInfoActivity'si çağırılacak
                        Intent intent = new Intent(context,CarInfoActivity.class);
                        intent.putExtra("carInfo", carInfo);
                        context.startActivity(intent);
                    }
                }
            });
        }
    }
}
