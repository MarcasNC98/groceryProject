// Generated by view binder compiler. Do not edit!
package com.example.groceryproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.groceryproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegistrationPageBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button registerBtn;

  @NonNull
  public final EditText registerEmail;

  @NonNull
  public final EditText registerName;

  @NonNull
  public final EditText registerPassword;

  @NonNull
  public final TextView registerSignIn;

  private ActivityRegistrationPageBinding(@NonNull LinearLayout rootView,
      @NonNull Button registerBtn, @NonNull EditText registerEmail, @NonNull EditText registerName,
      @NonNull EditText registerPassword, @NonNull TextView registerSignIn) {
    this.rootView = rootView;
    this.registerBtn = registerBtn;
    this.registerEmail = registerEmail;
    this.registerName = registerName;
    this.registerPassword = registerPassword;
    this.registerSignIn = registerSignIn;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegistrationPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegistrationPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_registration_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegistrationPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.registerBtn;
      Button registerBtn = ViewBindings.findChildViewById(rootView, id);
      if (registerBtn == null) {
        break missingId;
      }

      id = R.id.register_email;
      EditText registerEmail = ViewBindings.findChildViewById(rootView, id);
      if (registerEmail == null) {
        break missingId;
      }

      id = R.id.register_name;
      EditText registerName = ViewBindings.findChildViewById(rootView, id);
      if (registerName == null) {
        break missingId;
      }

      id = R.id.register_password;
      EditText registerPassword = ViewBindings.findChildViewById(rootView, id);
      if (registerPassword == null) {
        break missingId;
      }

      id = R.id.register_signIn;
      TextView registerSignIn = ViewBindings.findChildViewById(rootView, id);
      if (registerSignIn == null) {
        break missingId;
      }

      return new ActivityRegistrationPageBinding((LinearLayout) rootView, registerBtn,
          registerEmail, registerName, registerPassword, registerSignIn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
