package com.iplant.adapters.binding

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.iplant.R
import com.squareup.picasso.Picasso

@BindingAdapter("imageUrl")
fun loadImage(imageView: ImageView, imageUrl: String?) {
    if(imageUrl == null) {
        imageView.setImageDrawable(ContextCompat.getDrawable(imageView.context, R.drawable.ic_flower))
        imageView.alpha = 0.5f
    }
    else {
        Picasso.get().load(imageUrl).error(ContextCompat.getDrawable(imageView.context, R.drawable.ic_flower)!!).into(imageView)
        imageView.alpha = 1f
    }
}