package com.iyounix.beatbox;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.IsAnything.anything;
import static org.junit.Assert.*;


//RunWith 表明, 这是个 Android 工具测试, 需要 Android运行时环境支持
@RunWith(AndroidJUnit4.class)
public class BeatBoxActivityTest {

//    // Rule 表示, 告诉 JUnit 运行测试前, 要启动一个 BeatBoxActivity 实例
//    @Rule
//    public ActivityTestRule<BeatBoxActivity> mActivityRule =
//            new ActivityTestRule<>(BeatBoxActivity.class);

    @Test
    public void showsFirstFileName(){
        // onView 找到显示 65_cjipie 的视图
        // check 用来判定是否有这样的视图
        onView(withText("65_cjipie")).check(matches(anything()));
        //onView(withText("65_cjipie")).perform(click());

        //与视图交互时, Espresso 会等待应用显示再进行下一个测试
        //可以使用 IdlingResource 的一个子类告诉 Espresso , 多等一会, 用户还在忙
    }
}