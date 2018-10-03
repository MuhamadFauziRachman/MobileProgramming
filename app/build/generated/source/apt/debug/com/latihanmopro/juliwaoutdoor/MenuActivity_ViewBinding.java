// Generated code from Butter Knife. Do not modify!
package com.latihanmopro.juliwaoutdoor;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MenuActivity_ViewBinding implements Unbinder {
  private MenuActivity target;

  private View view2131165219;

  private View view2131165221;

  @UiThread
  public MenuActivity_ViewBinding(MenuActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MenuActivity_ViewBinding(final MenuActivity target, View source) {
    this.target = target;

    View view;
    target.txtTenda1 = Utils.findRequiredViewAsType(source, R.id.txt_tenda1, "field 'txtTenda1'", EditText.class);
    target.txtTenda2 = Utils.findRequiredViewAsType(source, R.id.txt_tenda2, "field 'txtTenda2'", EditText.class);
    target.txtTasKerrir = Utils.findRequiredViewAsType(source, R.id.txt_tas_kerrir, "field 'txtTasKerrir'", EditText.class);
    target.txtSleepingBag = Utils.findRequiredViewAsType(source, R.id.txt_sleeping_bag, "field 'txtSleepingBag'", EditText.class);
    target.txtFlysheet = Utils.findRequiredViewAsType(source, R.id.txt_flysheet, "field 'txtFlysheet'", EditText.class);
    target.txtMatras = Utils.findRequiredViewAsType(source, R.id.txt_matras, "field 'txtMatras'", EditText.class);
    target.txtSepatu = Utils.findRequiredViewAsType(source, R.id.txt_sepatu, "field 'txtSepatu'", EditText.class);
    target.txtLampuTenda = Utils.findRequiredViewAsType(source, R.id.txt_lampu_tenda, "field 'txtLampuTenda'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_cek_harga, "field 'btnCekHarga' and method 'onViewClicked'");
    target.btnCekHarga = Utils.castView(view, R.id.btn_cek_harga, "field 'btnCekHarga'", Button.class);
    view2131165219 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.texTampilHarga = Utils.findRequiredViewAsType(source, R.id.tex_tampil_harga, "field 'texTampilHarga'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btn_sewa, "field 'btnSewa' and method 'onViewClicked'");
    target.btnSewa = Utils.castView(view, R.id.btn_sewa, "field 'btnSewa'", Button.class);
    view2131165221 = view;
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
    MenuActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtTenda1 = null;
    target.txtTenda2 = null;
    target.txtTasKerrir = null;
    target.txtSleepingBag = null;
    target.txtFlysheet = null;
    target.txtMatras = null;
    target.txtSepatu = null;
    target.txtLampuTenda = null;
    target.btnCekHarga = null;
    target.texTampilHarga = null;
    target.btnSewa = null;

    view2131165219.setOnClickListener(null);
    view2131165219 = null;
    view2131165221.setOnClickListener(null);
    view2131165221 = null;
  }
}
