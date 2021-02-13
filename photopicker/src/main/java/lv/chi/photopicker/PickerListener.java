package lv.chi.photopicker;

import android.os.Parcelable;
import android.view.View;

public interface PickerListener extends Parcelable {
    void onViewCreated(View view);
    void onDestroy();
}
