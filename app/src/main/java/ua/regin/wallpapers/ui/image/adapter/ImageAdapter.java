package ua.regin.wallpapers.ui.image.adapter;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

import ua.regin.wallpapers.R;
import ua.regin.wallpapers.entity.ImageResponse;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {

    private final Context context;
    private List<ImageResponse> imageList;

    public ImageAdapter(Context context) {
        this.context = context;
    }

    public void setImageList(List<ImageResponse> imageList) {
        this.imageList = imageList;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_image, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ImageResponse image = imageList.get(position);

        ColorDrawable drawable = new ColorDrawable();
        drawable.setColor(context.getResources().getColor(android.R.color.darker_gray));

        Picasso.with(context).load(image.getImage().getPreview().getUrl()).placeholder(drawable)
                .fit().centerCrop().into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        int size = 0;
        if (imageList != null) {
            size = imageList.size();
        }
        return size;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}
