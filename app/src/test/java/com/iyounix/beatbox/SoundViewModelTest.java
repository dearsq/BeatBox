package com.iyounix.beatbox;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SoundViewModelTest {

    //使用虚拟 BeatBox , 虚拟对象继承 BeatBox.
    private BeatBox mBeatBox;
    private Sound mSound;
    private SoundViewModel mSubject; // 约定-> mSubject 是要测试的对象

    // Before 注解的包含公共代码的方法会在所有测试前运行一次
    @Before
    public void setUp() throws Exception {
        // mock(Class) 方法会自动创建一个虚拟版本的 BeatBox
        mBeatBox = mock(BeatBox.class);
        mSound = new Sound("assetPath");
        mSubject = new SoundViewModel(mBeatBox);
        mSubject.setSound(mSound);
    }

    @Test
    public void exposesSoundNameAsTitle() {
        //断言 返回相同的值
        assertThat(mSubject.getTitle(), is(mSound.getName()));
    }

    @Test
    public void callsBeatBoxPlayOnButtonClicked() {
        mSubject.onButtonClicked();
        verify(mBeatBox).play(mSound);
        //流接口,等价于==>
        //1. verify(mBeatBox)
        //2. mBeatBox.play(mSound)
        //作用: 验证以mSound作为参数，调用了mBeatBox对象的play(...)方法
    }
}