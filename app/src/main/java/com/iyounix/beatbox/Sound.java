package com.iyounix.beatbox;

public class Sound {
    private String mAssetPath;
    private String mName;
    private Integer mSoundId;

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename =  components[components.length - 1];
        mName = filename.replace(".wav","");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    //参数为 Integer ,则在 Sound 的 mSoundId 没有值时, 可以设置其为 null
    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }
}
