/*
 * Copyright 2018 JessYan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.jessyan.autosize.demo;

import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import cat.ereza.customactivityoncrash.config.CaocConfig;
import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.internal.CustomAdapt;

/**
 * ================================================
 * 鏈鏋舵牳蹇冨師鐞嗘潵鑷簬 <a href="https://mp.weixin.qq.com/s/d9QCoBP6kV9VSWvVldVVwA">浠婃棩澶存潯瀹樻柟閫傞厤鏂规</a>
 * 姝ゆ柟妗堜笉鍏夊彲浠ラ€傞厤 {@link Activity}, 杩欎釜 {@link Activity} 涓嬬殑鎵€鏈?{@link Fragment}銆亄@link Dialog}銆亄@link View} 閮戒細鑷姩閫傞厤
 * <p>
 * {@link MainActivity} 鏄互灞忓箷瀹藉害涓哄熀鍑嗚繘琛岄€傞厤鐨? 骞朵笖浣跨敤鐨勬槸鍦?AndroidManifest 涓～鍐欑殑鍏ㄥ眬璁捐鍥惧昂瀵?360 * 640
 * 涓嶆噦浠€涔堝彨鍩哄噯鐨勮瘽, 璇风湅 {@link AutoSizeConfig#isBaseOnWidth}) 鐨勬敞閲? AndroidAutoSize 榛樿鍏ㄥ眬浠ュ睆骞曞搴︿负鍩哄噯杩涜閫傞厤
 * 濡傛灉鎯虫洿鏀逛负鍏ㄥ眬浠ュ睆骞曢珮搴︿负鍩哄噯杩涜閫傞厤, 璇峰湪 {@link BaseApplication} 涓寜娉ㄩ噴涓洿鏀? 涓轰粈涔堝己璋冨叏灞€锛? * 鍥犱负 AndroidAutoSize 鍏佽姣忎釜 {@link Activity} 鍙互鑷畾涔夐€傞厤鍙傛暟, 鑷畾涔夐€傞厤鍙傛暟閫氳繃瀹炵幇 {@link CustomAdapt}
 * 濡傛灉涓嶈嚜瀹氫箟閫傞厤鍙傛暟灏变細浣跨敤鍏ㄥ眬鐨勯€傞厤鍙傛暟, 鍏ㄥ眬閫傞厤鍙傛暟鍦?{@link BaseApplication} 涓寜娉ㄩ噴璁剧疆
 * <p>
 * Created by JessYan on 2018/8/9 17:05
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * ================================================
 */
//瀹炵幇 CancelAdapt 鍗冲彲鍙栨秷褰撳墠 Activity 鐨勫睆骞曢€傞厤, 骞朵笖杩欎釜 Activity 涓嬬殑鎵€鏈?Fragment 鍜?View 閮戒細琚彇娑堥€傞厤
//public class MainActivity extends AppCompatActivity implements CancelAdapt {
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 闇€瑕佹敞鎰忕殑鏄殏鍋?AndroidAutoSize 鍚? AndroidAutoSize 鍙槸鍋滄浜嗗鍚庣画杩樻病鏈夊惎鍔ㄧ殑 {@link Activity} 杩涜閫傞厤鐨勫伐浣?     * 浣嗗宸茬粡鍚姩涓斿凡缁忛€傞厤鐨?{@link Activity} 涓嶄細鏈変换浣曞奖鍝?     *
     * @param view {@link View}
     */
    public void stop(View view) {
        Toast.makeText(getApplicationContext(), "AndroidAutoSize stops working!", Toast.LENGTH_SHORT).show();
        AutoSizeConfig.getInstance().stop(this);
    }

    /**
     * 闇€瑕佹敞鎰忕殑鏄噸鏂板惎鍔?AndroidAutoSize 鍚? AndroidAutoSize 鍙槸閲嶆柊寮€濮嬩簡瀵瑰悗缁繕娌℃湁鍚姩鐨?{@link Activity} 杩涜閫傞厤鐨勫伐浣?     * 浣嗗宸茬粡鍚姩涓斿湪 stop 鏈熼棿鏈€傞厤鐨?{@link Activity} 涓嶄細鏈変换浣曞奖鍝?     *
     * @param view {@link View}
     */
    public void restart(View view) {
        Toast.makeText(getApplicationContext(), "AndroidAutoSize continues to work", Toast.LENGTH_SHORT).show();
        AutoSizeConfig.getInstance().restart();
    }

    /**
     * 璺宠浆鍒?{@link CustomAdaptActivity}, 灞曠ず椤圭洰鍐呴儴鐨?{@link Activity} 鑷畾涔夐€傞厤鍙傛暟鐨勭敤娉?     *
     * @param view {@link View}
     */
    public void goCustomAdaptActivity(View view) {
        startActivity(new Intent(getApplicationContext(), CustomAdaptActivity.class));
    }

    /**
     * 璺宠浆鍒颁笁鏂瑰簱鐨?{@link Activity}, 灞曠ず椤圭洰澶栭儴鏌愪簺涓夋柟搴撶殑 {@link Activity} 鑷畾涔夐€傞厤鍙傛暟鐨勭敤娉?     * 璺宠浆鍓嶈鍏堝湪 {@link BaseApplication#customAdaptForExternal()} 涓粰澶栭儴鐨勪笁鏂瑰簱 {@link Activity} 鑷畾涔夐€傞厤鍙傛暟
     *
     * @param view {@link View}
     */
    public void goThirdLibraryActivity(View view) {
        //杩欓噷灏辨槸闅忎究鎵句釜涓夋柟搴撶殑 Activity, 娴嬭瘯涓嬮€傞厤涓夋柟搴撻〉闈㈢殑鍔熻兘鏄惁鍙敤
        //浠ヤ笅浠ｇ爜灏辨槸涓轰簡鍚姩杩欎釜涓夋柟搴撶殑 Activity, 涓嶅繀鍦ㄦ剰
        Intent intent = new Intent(getApplicationContext(), DefaultErrorActivity.class);
        Bundle extras = new Bundle();
        extras.putSerializable("cat.ereza.customactivityoncrash.EXTRA_CONFIG", CaocConfig.Builder.create().get());
        intent.putExtras(extras);
        startActivity(intent);
    }
}

