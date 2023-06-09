// Generated by view binder compiler. Do not edit!
package com.balabanova.humblr.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.balabanova.humblr.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CommonProgressErrorBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout error;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LottieAnimationView progressBar;

  @NonNull
  public final TextView textView;

  private CommonProgressErrorBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout error, @NonNull ImageView imageView,
      @NonNull LottieAnimationView progressBar, @NonNull TextView textView) {
    this.rootView = rootView;
    this.error = error;
    this.imageView = imageView;
    this.progressBar = progressBar;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CommonProgressErrorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CommonProgressErrorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.common_progress_error, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CommonProgressErrorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.error;
      ConstraintLayout error = ViewBindings.findChildViewById(rootView, id);
      if (error == null) {
        break missingId;
      }

      id = R.id.image_view;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      LottieAnimationView progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.text_view;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new CommonProgressErrorBinding((ConstraintLayout) rootView, error, imageView,
          progressBar, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
