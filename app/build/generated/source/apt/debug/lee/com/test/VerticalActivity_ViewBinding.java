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

public class VerticalActivity_ViewBinding implements Unbinder {
  private VerticalActivity target;

  @UiThread
  public VerticalActivity_ViewBinding(VerticalActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public VerticalActivity_ViewBinding(VerticalActivity target, View source) {
    this.target = target;

    target.mRecyclerview = Utils.findRequiredViewAsType(source, R.id.Hori_Recyclerview, "field 'mRecyclerview'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VerticalActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerview = null;
  }
}
