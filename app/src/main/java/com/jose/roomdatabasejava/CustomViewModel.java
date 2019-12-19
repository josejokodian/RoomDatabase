package com.jose.roomdatabasejava;

        import androidx.lifecycle.MutableLiveData;
        import androidx.lifecycle.ViewModel;

public class CustomViewModel extends ViewModel {
    private MutableLiveData<String> mName = new MutableLiveData<>();

    public MutableLiveData<String> getmName() {
        return mName;
    }

    public void setmName(String name) {
        mName.setValue(name);
    }


}
