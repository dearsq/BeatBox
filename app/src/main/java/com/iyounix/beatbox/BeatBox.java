package com.iyounix.beatbox;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.LoginException;

public class BeatBox {
    //
    private static final String TAG = "BeatBox";
    private static final String SOUND_FOLDER = "sample_sounds";

    private AssetManager mAssets;
    private List<Sound> mSounds = new ArrayList<>();

    public BeatBox(Context context) {
        mAssets = context.getAssets();
        loadSounds();
    }

    private void loadSounds() {
        // AssetManager.list(String) 方法可以列出指定目录下的所有文件
        String[] soundNames;
        try {
            soundNames = mAssets.list(SOUND_FOLDER);
            Log.i(TAG, "Found " + soundNames.length + " sounds" );
        } catch (IOException e) {
            Log.e(TAG, "Cound not list assets", e );
            return;
        }

        //将歌曲添加到 mSound 列表中
        for (String filename : soundNames) {
            String assetPath = SOUND_FOLDER + "/" + filename;
            Sound sound = new Sound(assetPath);
            mSounds.add(sound);
        }
    }

    public List<Sound> getSounds() {
        return mSounds;
    }
}
