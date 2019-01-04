// Generated code from Butter Knife. Do not modify!
package lee.com.test;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HorizontalActivity_ViewBinding implements Unbinder {
  private HorizontalActivity target;

  @UiThread
  public HorizontalActivity_ViewBinding(HorizontalActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HorizontalActivity_ViewBinding(HorizontalActivity target, View source) {
    this.target = target;

    target.mHori_Recyclerview = Utils.findRequiredViewAsType(source, R.id.Hori_Recyclerview, "field 'mHori_Recyclerview'", RecyclerView.class);
    target.mVerti_Recyclerview = Utils.findRequiredViewAsType(source, R.id.Verti_Recyclerview, "field 'mVerti_Recyclerview'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HorizontalActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mHori_Recyclerview = null;
    target.mVerti_Recyclerview = null;
  }
}
