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
    private final Callbacks callbacks;
    private List<ImageResponse> imageList;

    public ImageAdapter(Context context, Callbacks callbacks) {
        this.context = context;
        this.callbacks = callbacks;
    }

    public void setImageList(List<ImageResponse> imageList) {
        this.imageList = imageList;
        notifyDataSetChanged();
    }

    public List<ImageResponse> getImageList() {
        return imageList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_image, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ImageResponse imageResponse = imageList.get(position);

        ColorDrawable drawable = new ColorDrawable();
        drawable.setColor(context.getResources().getColor(android.R.color.darker_gray));

        Picasso.with(context).load(imageResponse.getImage().getPreview().getUrl()).placeholder(drawable)
                .fit().centerCrop().into(holder.imageView);

        holder.setOnClickListener(v -> callbacks.onClick(imageResponse));
    }

    @Override
    public int getItemCount() {
        int size = 0;
        if (imageList != null) {
            size = imageList.size();
        }
        return size;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView imageView;
        private View.OnClickListener onClickListener;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(this);
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            this.onClickListener = onClickListener;
        }

        @Override
        public void onClick(View v) {
            onClickListener.onClick(v);
        }
    }

    public interface Callbacks {
        void onClick(ImageResponse imageResponse);
    }
}
