// Generated code from Butter Knife. Do not modify!
package com.latihanmopro.juliwaoutdoor;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131165218;

  private View view2131165222;

  private View view2131165220;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_Lokasi, "field 'btnLokasi' and method 'onViewClicked'");
    target.btnLokasi = Utils.castView(view, R.id.btn_Lokasi, "field 'btnLokasi'", Button.class);
    view2131165218 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_telepon, "field 'btnTelepon' and method 'onViewClicked'");
    target.btnTelepon = Utils.castView(view, R.id.btn_telepon, "field 'btnTelepon'", Button.class);
    view2131165222 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_menu, "field 'btnMenu' and method 'onViewClicked'");
    target.btnMenu = Utils.castView(view, R.id.btn_menu, "field 'btnMenu'", Button.class);
    view2131165220 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btnLokasi = null;
    target.btnTelepon = null;
    target.btnMenu = null;

    view2131165218.setOnClickListener(null);
    view2131165218 = null;
    view2131165222.setOnClickListener(null);
    view2131165222 = null;
    view2131165220.setOnClickListener(null);
    view2131165220 = null;
  }
}
