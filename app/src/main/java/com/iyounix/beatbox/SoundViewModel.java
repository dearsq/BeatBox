package com.iyounix.beatbox;


/**
 * 1. 完成对 Sound 回调和监听器的设置
 * 2. 对 list_item_sound.xml 是可见属性
 */
public class SoundViewModel {
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
    }

    public String getTitle() {
        return mSound.getName();
    }
}
