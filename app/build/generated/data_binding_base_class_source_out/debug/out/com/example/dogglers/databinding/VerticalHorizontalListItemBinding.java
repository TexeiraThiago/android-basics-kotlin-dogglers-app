// Generated by view binder compiler. Do not edit!
package com.example.dogglers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dogglers.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class VerticalHorizontalListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final TextView dogAge;

  @NonNull
  public final TextView dogHobbie;

  @NonNull
  public final TextView dogName;

  @NonNull
  public final ImageView imageView;

  private VerticalHorizontalListItemBinding(@NonNull MaterialCardView rootView,
      @NonNull TextView dogAge, @NonNull TextView dogHobbie, @NonNull TextView dogName,
      @NonNull ImageView imageView) {
    this.rootView = rootView;
    this.dogAge = dogAge;
    this.dogHobbie = dogHobbie;
    this.dogName = dogName;
    this.imageView = imageView;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static VerticalHorizontalListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VerticalHorizontalListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.vertical_horizontal_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VerticalHorizontalListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dog_age;
      TextView dogAge = ViewBindings.findChildViewById(rootView, id);
      if (dogAge == null) {
        break missingId;
      }

      id = R.id.dog_hobbie;
      TextView dogHobbie = ViewBindings.findChildViewById(rootView, id);
      if (dogHobbie == null) {
        break missingId;
      }

      id = R.id.dog_name;
      TextView dogName = ViewBindings.findChildViewById(rootView, id);
      if (dogName == null) {
        break missingId;
      }

      id = R.id.image_view;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      return new VerticalHorizontalListItemBinding((MaterialCardView) rootView, dogAge, dogHobbie,
          dogName, imageView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}