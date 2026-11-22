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
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import me.jessyan.autosize.internal.CustomAdapt;

/**
 * ================================================
 * 鏈鏋舵牳蹇冨師鐞嗘潵鑷簬 <a href="https://mp.weixin.qq.com/s/d9QCoBP6kV9VSWvVldVVwA">浠婃棩澶存潯瀹樻柟閫傞厤鏂规</a>
 * <p>
 * {@link CustomAdaptActivity} 灞曠ず椤圭洰鍐呴儴鐨?{@link Activity} 鑷畾涔夐€傞厤鍙傛暟鐨勭敤娉? 闇€瑕佸疄鐜?{@link CustomAdapt}
 * 缁忚繃 {@link BaseApplication} 鐨勫垵濮嬪寲璁剧疆鍚? 鐜板湪 AndroidAutoSize 鏄叏灞€浠ュ睆骞曞搴︿负鍩哄噯杩涜閫傞厤鐨? 骞朵笖鍏ㄥ眬鐨勮璁″浘灏哄涓?360 * 640
 * 杩欓噷灏卞睍绀烘€庝箞璁?{@link CustomAdaptActivity} 鍗曚釜椤甸潰, 鏈夊埆浜庡叏灞€璁剧疆, 浠ュ睆骞曢珮搴︿负鍩哄噯杩涜閫傞厤, 骞朵笖鏇存敼璁捐鍥惧昂瀵镐负 IPhone 鐨勮璁″浘灏哄
 * 濡傛灉杩欎釜椤甸潰鐨勮璁″浘灏哄鏈夊埆浜庡叾浠栭〉闈? AndroidAutoSize 鍏佽鎮ㄦ敼鍙樺崟涓〉闈㈢殑璁捐鍥惧昂瀵? {@link #getSizeInDp()}
 * <p>
 * Created by JessYan on 2018/8/11 11:31
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * ================================================
 */
public class CustomAdaptActivity extends AppCompatActivity implements CustomAdapt {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapt);
    }

    /**
     * 鏄惁鎸夌収瀹藉害杩涜绛夋瘮渚嬮€傞厤 (涓轰簡淇濊瘉鍦ㄩ珮瀹芥瘮涓嶅悓鐨勫睆骞曚笂涔熻兘姝ｅ父閫傞厤, 鎵€浠ュ彧鑳藉湪瀹藉害鍜岄珮搴︿箣涓€変竴涓綔涓哄熀鍑嗚繘琛岄€傞厤)
     *
     * @return {@code true} 涓烘寜鐓у搴﹂€傞厤, {@code false} 涓烘寜鐓ч珮搴﹂€傞厤
     */
    @Override
    public boolean isBaseOnWidth() {
        return false;
    }

    /**
     * 杩欓噷浣跨敤 IPhone 鐨勮璁″浘, IPhone 鐨勮璁″浘灏哄涓?750px * 1334px, 楂樻崲绠楁垚 dp 涓?667 (1334px / 2 = 667dp)
     * <p>
     * 杩斿洖璁捐鍥句笂鐨勮璁″昂瀵? 鍗曚綅 dp
     * {@link #getSizeInDp} 椤婚厤鍚?{@link #isBaseOnWidth()} 浣跨敤, 瑙勫垯濡備笅:
     * 濡傛灉 {@link #isBaseOnWidth()} 杩斿洖 {@code true}, {@link #getSizeInDp} 鍒欏簲璇ヨ繑鍥炶璁″浘鐨勬€诲搴?     * 濡傛灉 {@link #isBaseOnWidth()} 杩斿洖 {@code false}, {@link #getSizeInDp} 鍒欏簲璇ヨ繑鍥炶璁″浘鐨勬€婚珮搴?     * 濡傛灉鎮ㄤ笉闇€瑕佽嚜瀹氫箟璁捐鍥句笂鐨勮璁″昂瀵? 鎯崇户缁娇鐢ㄥ湪 AndroidManifest 涓～鍐欑殑璁捐鍥惧昂瀵? {@link #getSizeInDp} 鍒欒繑鍥?{@code 0}
     *
     * @return 璁捐鍥句笂鐨勮璁″昂瀵? 鍗曚綅 dp
     */
    @Override
    public float getSizeInDp() {
        return 667;
    }
}

