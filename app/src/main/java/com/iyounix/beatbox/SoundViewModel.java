package com.iyounix.beatbox;


import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * 1. 完成对 Sound 回调和监听器的设置
 * 2. 对 list_item_sound.xml 是可见属性
 */
public class SoundViewModel extends BaseObservable {
    // adapter 要用的接口
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel (BeatBox beatBox) {
        mBeatBox = beatBox;
    }

    public Sound getSound() {
        return mSound;
    }

    public void setSound(Sound sound) {
        mSound = sound;
        //通知绑定类,ViewModel对象上所有可绑定属性都已更新
        notifyChange();
        //通知绑定类,ViewModel对象上只有 getTitle() 方法的值有变化
        //notifyPropertyChanged();

    }

    @Bindable
    public String getTitle() {
        return mSound.getName();
    }
}
