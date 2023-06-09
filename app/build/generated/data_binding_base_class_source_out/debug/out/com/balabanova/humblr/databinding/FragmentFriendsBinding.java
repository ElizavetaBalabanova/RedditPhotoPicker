// Generated by view binder compiler. Do not edit!
package com.balabanova.humblr.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.balabanova.humblr.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFriendsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView buttonBack;

  @NonNull
  public final CommonProgressErrorBinding common;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final AppBarLayout topAppBar;

  private FragmentFriendsBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView buttonBack,
      @NonNull CommonProgressErrorBinding common, @NonNull RecyclerView recyclerView,
      @NonNull AppBarLayout topAppBar) {
    this.rootView = rootView;
    this.buttonBack = buttonBack;
    this.common = common;
    this.recyclerView = recyclerView;
    this.topAppBar = topAppBar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFriendsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFriendsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_friends, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFriendsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_back;
      ImageView buttonBack = ViewBindings.findChildViewById(rootView, id);
      if (buttonBack == null) {
        break missingId;
      }

      id = R.id.common;
      View common = ViewBindings.findChildViewById(rootView, id);
      if (common == null) {
        break missingId;
      }
      CommonProgressErrorBinding binding_common = CommonProgressErrorBinding.bind(common);

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.topAppBar;
      AppBarLayout topAppBar = ViewBindings.findChildViewById(rootView, id);
      if (topAppBar == null) {
        break missingId;
      }

      return new FragmentFriendsBinding((ConstraintLayout) rootView, buttonBack, binding_common,
          recyclerView, topAppBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
