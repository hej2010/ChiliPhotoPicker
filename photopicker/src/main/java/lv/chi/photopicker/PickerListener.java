package lv.chi.photopicker;

import android.view.View;

import java.io.Serializable;

public interface PickerListener extends Serializable {
    void onViewCreated(View view);
    void onDismissed();
}
